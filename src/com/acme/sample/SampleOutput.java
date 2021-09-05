package com.acme.sample;

import com.acme.model.*;

public class SampleOutput {

    public static void main(String[] args) {
        //testingModel();
        //testingSerialNumberGen();
        //testingCustomOptions();
        //testingCustomOptions2();
        testPrepForSale();
    }

    public static void testPrepForSale() {
        BikeFacade myFacade = new BikeFacade();
        myFacade.prepareForSale(new VintageBike(new NormalWheel()));
    }

    public static void testingCustomOptions2() {
        BikeInterface ccBike = new CrossCountryBike(new WideWheel());
        System.out.println(ccBike);

        ccBike = new WhiteTireOption(ccBike);
        System.out.println(ccBike);

        ccBike = new GoldFrameOption(ccBike);
        System.out.println(ccBike);

    }

    public static void testingCustomOptions() {
        BikeInterface touring = new TouringBike(new NormalWheel());
        System.out.println(touring);

        touring = new LeatherSeatOption(touring);
        // ensure the frame color doesn't change
        // AbstractBikeOption is set to CHROME
        //touring.paint(BikeColor.Blue);
        System.out.println(touring);
        System.out.println(touring.getModel() + " good"); // testing other options

        touring = new LeatherGripsOption(touring);
        System.out.println(touring);
        //TODO May need to add a method for original price for receipt print out
    }

    /*
     * SerialNumberGenerator work as expected. For us to use these changing
     * serial numbers, our inventory could created using a HashMap
     * HashMap takes a key-value-pair. key would be the serial number value would
     * be the object instance of the bike.
     * */
    public static void testingSerialNumberGen() {
        DownhillBike bike = new DownhillBike(new WideWheel());
        SerialNumberGenerator generator = SerialNumberGenerator.getInstance();
        generator.setModelAndStart(bike.getModel(), bike.getStartNumber());
        bike.setSerialNumber(generator.getNextSerial());
        System.out.println("Next serial is " + generator.getNextSerial());
        System.out.println("Next serial is " + generator.getNextSerial());
        System.out.println("Next serial is " + generator.getNextSerial());

        System.out.println("My bike serial number is " + bike.getSerialNumber());
        SerialNumberGenerator myGen =
                SerialNumberGenerator.getInstance();
        generator.setModelAndStart(bike.getModel(), bike.getStartNumber());
        System.out.println("Next serial is " + myGen.getNextSerial());
        System.out.println("Next serial is " + myGen.getNextSerial());
        System.out.println("Next serial is " + myGen.getNextSerial());

        // myGen.testObject();
    }

    public static void testingModel() {
        VintageBike myBike = new VintageBike(new NormalWheel());
        System.out.println(myBike.getModel());
        System.out.println(myBike.getStartNumber());
        System.out.println(myBike.getWheel().isWide());
    }
}