package jrout.tutorial.client;

import jrout.pricing.PriceTag;
import jrout.tutorial.computing.ComputerHardware;
import org.apache.log4j.Logger;

public class ComputerDriver {
    private static Logger log = Logger.getLogger(ComputerDriver.class);

    public static void main(String[] args) {

        //
        log.info("Entering the main method...");

        int a = 10;
        int b =  5;
        log.debug("I am trying to multiply "+ a + " with "+ b);
        System.out.println(a * b);

        log.info("Existing the main method...");
        for (int i = 0; i < 10000; i++) {
            log.debug(" Print "+ i);
            log.info("Hello this is info level enabled");
            log.info("Hello this is info level enabled");
            log.info("Hello this is info level enabled");
            log.info("Hello this is info level enabled");
            log.info("Hello this is info level enabled");
            log.info("Hello this is info level enabled");
            log.info("Hello this is info level enabled");
            // some real calculation
        }
        log.trace("Trace level");
        log.debug("Debug level");
        log.info("Info level");
        log.warn("Warn level");
        log.error("Error level");
        log.fatal("Fatal Level");

        String name = null;
        try{
            System.out.println(name.toString());

        }catch (Exception exp){
            log.error(exp);
        }

    }


}
