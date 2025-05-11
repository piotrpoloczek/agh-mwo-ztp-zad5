package pl.edu.agh.mwo.java1.demo.order;

import pl.edu.agh.mwo.java1.demo.delivery.IPizzaDelivery;
import pl.edu.agh.mwo.java1.demo.Pizza;

public class ByPhone implements IPizzaOrder {

    private IPizzaDelivery pizzaDelivery;

    public void setPizzaDelivery(IPizzaDelivery pizzaDelivery) {
        this.pizzaDelivery = pizzaDelivery;
    }

    public Pizza orderPizza(String name) {
        Pizza pizza = pizzaDelivery.deliverPizza(name);
        pizza.setOrderedBy("telefon");
        return pizza;
    }
}
