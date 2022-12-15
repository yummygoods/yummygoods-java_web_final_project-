package com.example.java_web_final_project;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ThingService {
    private final ThingRepository thingRepository;
    public ThingService(@Autowired ThingRepository thingRepository){
        this.thingRepository = thingRepository;
    }

    public Thing save(Thing thing){
        return thingRepository.save(thing);
    }

    public void delete(Integer thingId){
        thingRepository.deleteById(thingId);
    }

    public List<Thing> all(){
        return thingRepository.findAll();
    }
public Thing findById(Integer thingId){
    Optional<Thing> thing = thingRepository.findById(thingId);
    boolean isPresent = thing.isPresent();
    if (isPresent) {
        return thing.get();
    } else {
        return null;
    }
}
}
