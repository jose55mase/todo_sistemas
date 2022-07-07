package com.development.todo1.controller;



import com.development.todo1.entity.BillEntity;

import com.development.todo1.service.BillService;
import com.development.todo1.util.RestResponse;
import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.io.IOException;
import java.time.LocalDate;
import java.util.List;

@CrossOrigin(origins = "*", maxAge = 3600, allowedHeaders = "*")
@RestController
@RequestMapping("/bill")
public class BillController {

    @Autowired
    protected BillService billService;
    // rolValidator = new RolValidator();

    protected ObjectMapper mapper;

    @GetMapping("/list")
    public List<BillEntity> list(){
        return this.billService.findAll();
    }

    @RequestMapping(value = "/save", method = RequestMethod.POST)
    public RestResponse save(@RequestBody String json)
            throws JsonParseException, JsonMappingException, IOException {
        this.mapper = new ObjectMapper();
        BillEntity data = this.mapper.readValue(json, BillEntity.class);
        data.setDate(LocalDate.now());
        this.billService.save(data);
        return new RestResponse(HttpStatus.OK.value(),"Guardado");
    }

    @RequestMapping(value = "/update", method = RequestMethod.PUT)
    public RestResponse  update(@RequestBody String json)
            throws JsonParseException, JsonMappingException, IOException {
        this.mapper = new ObjectMapper();
        BillEntity data = this.mapper.readValue(json, BillEntity.class);
        this.billService.save(data);
        return new RestResponse(HttpStatus.OK.value(),"Actualizado");
    }


}
