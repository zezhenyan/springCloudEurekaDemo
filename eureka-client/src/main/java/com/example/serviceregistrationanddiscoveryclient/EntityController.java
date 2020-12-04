package com.example.serviceregistrationanddiscoveryclient;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EntityController {



    @Autowired
    EntityService entityService;
    @GetMapping("/entity/{id}")
    public Entity getEntity(@PathVariable  String id){
        return entityService.findEntityById(id);
    }

}