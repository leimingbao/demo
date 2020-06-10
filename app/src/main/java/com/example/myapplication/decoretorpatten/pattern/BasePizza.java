package com.example.myapplication.decoretorpatten.pattern;

public class BasePizza extends Pizza {

    @Override
    public String getName() {
        name = "原味pizza";
        return name;
    }

    @Override
    public double getPrice() {
        return 50;
    }

}
