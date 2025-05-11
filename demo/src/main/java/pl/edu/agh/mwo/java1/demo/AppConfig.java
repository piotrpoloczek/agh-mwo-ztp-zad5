package pl.edu.agh.mwo.java1.demo;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import pl.edu.agh.mwo.java1.demo.baking.IPizzaBake;
import pl.edu.agh.mwo.java1.demo.baking.PizzaBanolli;
import pl.edu.agh.mwo.java1.demo.delivery.ByCar;
import pl.edu.agh.mwo.java1.demo.delivery.IPizzaDelivery;
import pl.edu.agh.mwo.java1.demo.order.ByPhone;
import pl.edu.agh.mwo.java1.demo.order.IPizzaOrder;

@Configuration
public class AppConfig {

    @Bean
    public IPizzaBake pizzaBake() {
        return new PizzaBanolli();
    }

    @Bean
    public IPizzaDelivery pizzaDelivery() {
        ByCar delivery = new ByCar();
        delivery.setPizzaBake(pizzaBake()); // setter injection
        return delivery;
    }

    @Bean
    public IPizzaOrder pizzaOrder() {
        ByPhone order = new ByPhone();
        order.setPizzaDelivery(pizzaDelivery()); // setter injection
        return order;
    }

    @Bean
    public Consumer consumer() {
        return new Consumer(pizzaOrder()); // constructor injection
    }
}
