package com.example.myapplication.decoretorpatten;

import com.example.myapplication.decoretorpatten.pattern.BasePizza;
import com.example.myapplication.decoretorpatten.pattern.Pizza;
import com.example.myapplication.decoretorpatten.pattern.PizzaA;
import com.example.myapplication.decoretorpatten.pattern.PizzaB;

import javax.inject.Inject;

public class DecoratorPatternViewModel {

    Pizza pizza = new BasePizza();
    PizzaA pizzaA = new PizzaA(new PizzaB(pizza));

    @Inject
    public DecoratorPatternViewModel() {
    }

    public void show() {
        pizzaA.show();
    }
}
