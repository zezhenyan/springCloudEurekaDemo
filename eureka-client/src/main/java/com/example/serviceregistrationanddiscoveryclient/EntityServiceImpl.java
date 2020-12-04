package com.example.serviceregistrationanddiscoveryclient;

import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;

@Service
public class EntityServiceImpl implements EntityService{
    static Map<String, Entity> data = new HashMap<String, Entity>();
    static{
        Entity entity = new Entity("1");
        entity.setLongName("Advent Software Inc");
        entity.setShortName("ADVS");
        data.put("1", entity);
        entity = new Entity("2");
        entity.setLongName("International Business Machines Corp");
        entity.setShortName("IBM");
        data.put("2", entity);
    }
    @Override
    public Entity findEntityById(String id) {
        return data.get(id);
    }
}
