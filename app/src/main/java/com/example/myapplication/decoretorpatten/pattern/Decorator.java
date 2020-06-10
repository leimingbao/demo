package com.example.myapplication.decoretorpatten.pattern;

public abstract class Decorator extends Pizza {
    @Override
    public double getPrice() {
        return this.getPrice();
    }

    public void show() {
        System.out.println(this.getName()+ " " + this.getPrice());
    }
}
