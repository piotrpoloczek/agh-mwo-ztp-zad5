package pl.edu.agh.mwo.java1.demo.baking;

import pl.edu.agh.mwo.java1.demo.Pizza;

public class PizzaBanolli implements IPizzaBake {
    public Pizza bakePizza(String name) {
        Pizza pizza = new Pizza(name);
        pizza.setBakedBy("PizzaBanolli");
        return pizza;
    }
}
