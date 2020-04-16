package jrout.tutorial.springboot.sbactivemq;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.jms.core.JmsTemplate;

@SpringBootTest
class SbActivemqApplicationTests {

    @Autowired
    JmsTemplate jmsTemplate;

    @Test
    void contextLoads() {
    }

    @Test
    public void sendMessageToQ(){
        jmsTemplate.convertAndSend("greeting.queue", "Two");
        System.out.println("message is been send...");
    }
}
