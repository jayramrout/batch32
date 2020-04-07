package jrout.tutorial.ws;

import javax.jws.WebMethod;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;

@WebService
@SOAPBinding
public interface IHelloWorld {

    @WebMethod(operationName = "myHelloWorld")
    String helloWorld(String firstName, String lastName);

    @WebMethod(operationName = "printName")
    void printName(String firstName, String lastName);

//    @WebMethod
//    @SOAPBinding(parameterStyle = SOAPBinding.ParameterStyle.WRAPPED)
//    void printName(Person person);
}

class Person{
    private String firstName;
    private String lastName;
}