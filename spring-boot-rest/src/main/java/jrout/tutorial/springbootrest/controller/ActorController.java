package jrout.tutorial.springbootrest.controller;

import jrout.tutorial.springbootrest.domain.Actor;
import lombok.extern.log4j.Log4j2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.logging.Logger;

@RestController(value = "myapp")
@Log4j2
public class ActorController {

//    @Autowired

    @GetMapping("/hello")
    public String sayHello(@RequestParam(value = "name" , defaultValue = "Jagan") String na) {
        return "Hello Good Morning "+ na;
    }

    @PostMapping("/hello")
    public String sayHelloPost(@RequestParam(value = "name" , defaultValue = "Jagan") String na) {
        return "Hello Good Morning "+ na;
    }

    @GetMapping("/actor")
    public Actor getActor(){
        Actor actor = new Actor();
        actor.setActorId(100);
        actor.setFirstName("Peter");
        actor.setLastName("Pan");
        return actor;
    }

}
