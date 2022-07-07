package com.development.todo1.controller;


import com.development.todo1.entity.RolEntity;
import com.development.todo1.service.RolService;
import com.development.todo1.util.RestResponse;
import com.development.todo1.validator.RolValidator;
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
@RequestMapping("/rol")
public class RolController {

    @Autowired
    protected RolService rolService;
    RolValidator rolValidator = new RolValidator();

    protected ObjectMapper mapper;

    @GetMapping("/list")
    public List<RolEntity> list(){
       return this.rolService.findAll();
    }


    @RequestMapping(value = "/save", method = RequestMethod.POST)
    public RestResponse  save(@RequestBody String json)
            throws JsonParseException, JsonMappingException, IOException {
        this.mapper = new ObjectMapper();
        RolEntity data = this.mapper.readValue(json, RolEntity.class);
        this.rolService.save(data);
        return new RestResponse(HttpStatus.OK.value(),"Guardado");
    }

    @RequestMapping(value = "/update", method = RequestMethod.PUT)
    public RestResponse  update(@RequestBody String json)
            throws JsonParseException, JsonMappingException, IOException {
        this.mapper = new ObjectMapper();
        RolEntity data = this.mapper.readValue(json, RolEntity.class);
        this.rolService.save(data);
        return new RestResponse(HttpStatus.OK.value(),"Actualizado");
    }

    @RequestMapping(value = "/delete", method = RequestMethod.PUT)
    public RestResponse  delete(@RequestBody String json)
            throws JsonParseException, JsonMappingException, IOException {
        this.mapper = new ObjectMapper();
        RolEntity data = this.mapper.readValue(json, RolEntity.class);
        if(this.rolValidator.delete(data.getCode())){
            data.setState(this.rolValidator.delete(data.getCode()));
            this.rolService.save(data);
            return new RestResponse(HttpStatus.OK.value(),"Eliminando");
        }else{
            return new RestResponse(HttpStatus.BAD_REQUEST.value(),"NO hay datos");
        }
    }

}

