package com.manny;

public class Ignition {
    private boolean pushToStart;

    public Ignition(boolean pushToStart) {
        this.pushToStart = pushToStart;
    }

    public void turnOn(){
        System.out.println("Ignition -> Starting car");
    }

    public boolean isPushToStart() {
        return pushToStart;
    }
}
