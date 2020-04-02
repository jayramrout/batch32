package jrout.tutorial.ws;

import javax.xml.ws.Endpoint;

public class HelloWorldPublisher {
    public static void main(String[] args) {
        Endpoint.publish("http://localhost:8888/ws/hello", new HelloWorldImpl());
        System.out.println("HW Webservice is published...");

//        http://localhost:8888/ws/hello?wsdl
    }
}
