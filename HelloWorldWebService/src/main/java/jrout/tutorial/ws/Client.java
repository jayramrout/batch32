package jrout.tutorial.ws;

import javax.xml.namespace.QName;
import javax.xml.ws.Service;
import java.net.MalformedURLException;
import java.net.URL;

public class Client {
    public static void main(String[] args) throws MalformedURLException {
        // http://localhost:8888/ws/hello?wsdl
        URL url = new URL("http://localhost:8888/ws/hello?wsdl");
        QName qName = new QName("http://ws.tutorial.jrout/","HelloWorldImplService");

        Service service = Service.create(url, qName);
        IHelloWorld port = service.getPort(IHelloWorld.class);
        String s = port.helloWorld("Peter", "Pan");
        System.out.println(s);

    }
}
