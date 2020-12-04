package com.example.serviceregistrationanddiscoveryclient;

import com.netflix.appinfo.InstanceInfo;
import com.netflix.discovery.EurekaClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;
 
@RestController
public class EntityClientController {
 
    @Autowired
    private RestTemplate restTemplate;

    @Autowired
    private EurekaClient eurekaClient;

    @GetMapping("/EntityClient/{id}")
    public Entity getEntity(@PathVariable  String id){
        InstanceInfo instanceInfo=eurekaClient.getNextServerFromEureka("ENTITY",false);
        String entityUrl=instanceInfo.getHomePageUrl();
        System.out.println("userUrl====================="+entityUrl);

        return  restTemplate.getForObject(entityUrl+"/entity/"+id, Entity.class);
    }
}