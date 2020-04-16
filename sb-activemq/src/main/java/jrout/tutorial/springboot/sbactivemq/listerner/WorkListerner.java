package jrout.tutorial.springboot.sbactivemq.listerner;

import org.springframework.jms.annotation.JmsListener;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.stereotype.Component;

import javax.jms.JMSException;
import javax.jms.Message;
import javax.jms.TextMessage;

@Component
public class WorkListerner {

    @JmsListener(destination = "greeting.queue")
    @SendTo("work.queue")
    public String receiveMessage(final Message message){
        String text = null;
        if(message instanceof TextMessage) {
            TextMessage myTextMessage = (TextMessage)message;

            try {
                text = myTextMessage.getText();
            } catch (JMSException e) {
                e.printStackTrace();
            }

            System.out.println(text);
            text += " Hello This is my Final MEssage";

        }
        return text;
    }
}
