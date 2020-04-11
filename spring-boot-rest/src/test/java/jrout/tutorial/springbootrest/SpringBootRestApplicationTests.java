package jrout.tutorial.springbootrest;

import jrout.tutorial.springbootrest.domain.Actor;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class SpringBootRestApplicationTests {

    @Test
    void contextLoads() {
    }

    public void testLombok(){
        Actor actor = new Actor();
        actor.getLastUpdate();

    }

}
