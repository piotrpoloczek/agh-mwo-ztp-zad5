package pl.edu.agh.mwo.java1.demo.delivery;

import pl.edu.agh.mwo.java1.demo.baking.IPizzaBake;
import pl.edu.agh.mwo.java1.demo.Pizza;

public class ByCar implements IPizzaDelivery {

    private IPizzaBake pizzaBake;

    public void setPizzaBake(IPizzaBake pizzaBake) {
        this.pizzaBake = pizzaBake;
    }

    public Pizza deliverPizza(String name) {
        Pizza pizza = pizzaBake.bakePizza(name);
        pizza.setDeliveredBy("samochodem");
        return pizza;
    }
}
