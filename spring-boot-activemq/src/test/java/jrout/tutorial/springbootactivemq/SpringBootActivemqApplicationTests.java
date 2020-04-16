package jrout.tutorial.springbootactivemq;

import org.apache.activemq.ActiveMQConnectionFactory;
import org.apache.activemq.command.ActiveMQQueue;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.jms.annotation.EnableJms;
import org.springframework.jms.core.JmsTemplate;

import javax.jms.*;

@SpringBootTest

class SpringBootActivemqApplicationTests {

    @Autowired
    JmsTemplate jmsTemplate;

    @Test
    void contextLoads() {
    }

    @Test
    public void sendMessage(){
        System.out.println(jmsTemplate);
        jmsTemplate.convertAndSend("inbound.queue", "Hello form program");
        System.out.println("Message send....");
    }


    @Test
    public void sendMessageToWorkQ(){
        ConnectionFactory cf = new ActiveMQConnectionFactory(
                "tcp://localhost:61616");
        try{
            Connection connection = cf.createConnection();
            Session session = connection.createSession(true, Session.AUTO_ACKNOWLEDGE);
            Destination destination = new ActiveMQQueue("work.queue");
            MessageProducer producer = session.createProducer(destination);
            TextMessage message = session.createTextMessage();
            message.setText("Hello Batch 32");
            producer.send(message);
            System.out.println("Message is been send...");
            session.commit();

        }catch (Exception exp) {
            exp.printStackTrace();
        }

    }
}
