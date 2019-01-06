package com.manny;

public class Engine {

    private boolean v8;

    public Engine(boolean v8) {
        this.v8 = v8;
    }

    public void start(){
        System.out.println("Engine -> Engine is now started");
    }

    public boolean isV8() {
        return v8;
    }
}
