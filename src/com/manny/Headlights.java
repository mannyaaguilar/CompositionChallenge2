package com.manny;

public class Headlights {
    private boolean hid;

    public Headlights(boolean hid) {
        this.hid = hid;
    }

    public void headlights(){
        System.out.println("Headlights - > Headlights are now on");
    }

    public boolean isHid() {
        return hid;
    }
}
