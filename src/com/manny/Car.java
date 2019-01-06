package com.manny;

public class Car {
    private String model;
    private Wheel wheel1;
    private Wheel wheel2;
    private Wheel wheel3;
    private Wheel wheel4;
    private Ignition ignition;
    private Headlights headlights;
    private Transmission transmission;
    private Engine engine;

    public Car(String model, Wheel wheel1, Wheel wheel2, Wheel wheel3, Wheel wheel4, Ignition ignition, Headlights headlights, Transmission transmission, Engine engine) {
        this.model = model;
        this.wheel1 = wheel1;
        this.wheel2 = wheel2;
        this.wheel3 = wheel3;
        this.wheel4 = wheel4;
        this.ignition = ignition;
        this.headlights = headlights;
        this.transmission = transmission;
        this.engine = engine;
    }

    public void startIgnition(){
        ignition.turnOn();
    }

    public void startEngine(){
        engine.start();
    }

    public void turnHeadlightsOn(){
        headlights.headlights();
    }

    public void moveToDrive(){
        System.out.println("Transmission -> Gear moved to Drive");
        transmission.moveGear();
    }

    public void moveWheels(){
        wheel1.move();

    }

}
