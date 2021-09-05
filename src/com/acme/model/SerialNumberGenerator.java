package com.acme.model;

public class SerialNumberGenerator {
    private  static SerialNumberGenerator one;

    private  String modelNumber;
    private  int start;

    public static synchronized SerialNumberGenerator getInstance() {
        if(one == null) {
            one = new SerialNumberGenerator();
        }
        return one;
    }

    private SerialNumberGenerator() { }

    public synchronized void setModelAndStart(String model, int startNum){
        modelNumber = model;
        start = startNum;
    }
    public synchronized String getNextSerial() { return modelNumber + ++start; }
    public synchronized int getRecentNumber(){ return start;}

    TouringBike tBike;
    public void testObject() {
        System.out.println(tBike);
    }
}