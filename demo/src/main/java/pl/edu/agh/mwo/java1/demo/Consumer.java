package pl.edu.agh.mwo.java1.demo;

import pl.edu.agh.mwo.java1.demo.order.IPizzaOrder;

public class Consumer {
    private final IPizzaOrder pizzaOrder;

    public Consumer(IPizzaOrder pizzaOrder) {
        this.pizzaOrder = pizzaOrder;
    }

    public void makeOrder() {
        Pizza pizza = pizzaOrder.orderPizza("Margherita");
        pizza.printHistory();
    }
}
