package com.example.java_web_final_project;

import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping ("/thing")
public class ThingController {


    final ThingRepository thingRepository;
    final ThingService thingService;
    public ThingController(ThingRepository thingRepository, ThingService thingService){
        this.thingRepository = thingRepository;
        this.thingService = thingService;
    }


    //    Your controller must have routes for all four main CRUD methods (Get, Post, Put, Delete)
  @GetMapping ("/all")
  public Iterable<Thing> getThings(){

      return thingRepository.findAll();
  }

    @GetMapping ("/{id}")
    public Thing findThingById( @PathVariable Integer id ){

        return thingService.findById( id );
    }
    @PostMapping
    public Thing save( @RequestBody ThingDto thingDto){
        return thingService.save(new Thing( thingDto ));
    }

    @PutMapping( "/{id}" )
    public Thing update( @RequestBody ThingDto thingDto, @PathVariable Integer id )
    {
       Thing thing = thingService.findById( id );
        thing.setName( thing.getName() );
      thing.setDescription( thingDto.getDescription() );
       thing.setImageUrl( thingDto.getImageUrl() );
        return thingService.save( thing );
    }



    @DeleteMapping( "/{id}" )
    public void delete( @PathVariable Integer id )
    {
        thingService.delete( id );
    }
}
