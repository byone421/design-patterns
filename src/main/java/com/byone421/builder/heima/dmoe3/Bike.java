package com.byone421.builder.heima.dmoe3;

public class Bike {
    private String brand;

    private String seat;

    public Bike( ) {

    }
    public Bike(String brand, String seat) {
        this.brand = brand;
        this.seat = seat;
    }


    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getSeat() {
        return seat;
    }

    public void setSeat(String seat) {
        this.seat = seat;
    }
}
