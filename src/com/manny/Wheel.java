package com.manny;

public class Wheel {
    private String brand;
    private String size;

    public Wheel(String brand, String size) {
        this.brand = brand;
        this.size = size;
    }

    public void move(){
        System.out.println("Wheels -> Wheels are Turning.  See ya later!!!!!!");
    }

    public String getBrand() {
        return brand;
    }

    public String getSize() {
        return size;
    }
}
