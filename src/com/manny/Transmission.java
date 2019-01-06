package com.manny;

public class Transmission {
    private boolean sixSpeed;

    public Transmission(boolean sixSpeed) {
        this.sixSpeed = sixSpeed;
    }

    public void moveGear(){
        System.out.println("Transmission -> Car is moving forward.");
    }

    public boolean isSixSpeed() {
        return sixSpeed;
    }
}
