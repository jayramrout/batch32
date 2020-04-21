package jrout.tutorial.springbootdatajpa;

import jrout.tutorial.springbootdatajpa.domain.Actor;
import jrout.tutorial.springbootdatajpa.repository.ActorRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;
import java.util.Optional;

@SpringBootTest
class SpringBootDataJpaApplicationTests {

    @Autowired
    private ActorRepository actorRepository;

    @Test
    void contextLoads() {
    }

    @Test
    public void testQueryActor(){
        Optional<Actor> byId = actorRepository.findById(1);
        Actor actor = byId.get();
        System.out.println(actor);

        List<Actor> nick = actorRepository.findByFirstName("Nick");
        System.out.println(nick);

    }


}
