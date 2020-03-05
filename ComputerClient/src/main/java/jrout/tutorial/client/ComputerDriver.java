package jrout.tutorial.client;

import jrout.pricing.PriceTag;
import jrout.tutorial.computing.ComputerHardware;

public class ComputerDriver {
    public static void main(String[] args) {
        ComputerHardware computerHardware = new ComputerHardware();
        computerHardware.printHWDetails();

        PriceTag priceTag = new PriceTag();


    }
}
