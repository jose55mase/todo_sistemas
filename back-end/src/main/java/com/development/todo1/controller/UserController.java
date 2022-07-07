package com.development.todo1.controller;


import com.development.todo1.entity.UserEntity;
import com.development.todo1.service.UserService;
import com.development.todo1.util.RestResponse;
import com.development.todo1.validator.UserValidator;
import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.io.IOException;
import java.util.List;

@CrossOrigin(origins = "*", maxAge = 3600, allowedHeaders = "*")
@RestController
@RequestMapping("/user")
public class UserController {


    @Autowired
    protected UserService userService;
    UserValidator userValidator = new UserValidator();

    protected ObjectMapper mapper;

    @GetMapping("/list")
    public List<UserEntity> list(){
        return this.userService.findAll();
    }


    @RequestMapping(value = "/save", method = RequestMethod.POST)
    public RestResponse save(@RequestBody String json)
            throws JsonParseException, JsonMappingException, IOException {
        this.mapper = new ObjectMapper();
        UserEntity data = this.mapper.readValue(json, UserEntity.class);
        this.userService.save(data);
        return new RestResponse(HttpStatus.OK.value(),"Guardado");
    }

    @RequestMapping(value = "/update", method = RequestMethod.PUT)
    public RestResponse  update(@RequestBody String json)
            throws JsonParseException, JsonMappingException, IOException {
        this.mapper = new ObjectMapper();
        UserEntity data = this.mapper.readValue(json, UserEntity.class);
        this.userService.save(data);
        return new RestResponse(HttpStatus.OK.value(),"Actualizado");
    }

    @RequestMapping(value = "/delete", method = RequestMethod.PUT)
    public RestResponse  delete(@RequestBody String json)
            throws JsonParseException, JsonMappingException, IOException {
        this.mapper = new ObjectMapper();
        UserEntity data = this.mapper.readValue(json, UserEntity.class);
        if(this.userValidator.delete(data.getCode())){
            data.setState(this.userValidator.delete(data.getCode()));
            this.userService.save(data);
            return new RestResponse(HttpStatus.OK.value(),"Eliminando");
        }else{
            return new RestResponse(HttpStatus.BAD_REQUEST.value(),"NO hay datos");
        }
    }
}
