package com.manny;

public class Main {

    public static void main(String[] args) {
	    Wheel wheel1 = new Wheel("Michellin", "235/40/R17");
        Wheel wheel2 = new Wheel("Michellin", "235/40/R17");
        Wheel wheel3 = new Wheel("Michellin", "235/40/R17");
        Wheel wheel4 = new Wheel("Michellin", "235/40/R17");

        Ignition theIgnition = new Ignition(true);

        Engine theEngine = new Engine(true);

        Headlights theHeadlights = new Headlights(true);

        Transmission theTransmission = new Transmission(true);

        Car theCar = new Car("Accord", wheel1, wheel2, wheel3, wheel4, theIgnition, theHeadlights, theTransmission, theEngine);
        theCar.startIgnition();
        theCar.startEngine();
        theCar.turnHeadlightsOn();
        theCar.moveToDrive();
        theCar.moveWheels();

    }
}
