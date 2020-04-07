package jrout.tutorial.ws;

import javax.jws.WebService;

@WebService(endpointInterface = "jrout.tutorial.ws.IHelloWorld")
public class HelloWorldImpl implements IHelloWorld {

    @Override
    public String helloWorld(String firstName, String lastName) {
        return "Hello " + firstName +" "+ lastName +" How are you...";
    }

    @Override
    public void printName(String firstName, String lastName) {
        System.out.println(firstName +" "+ lastName);
    }
}
