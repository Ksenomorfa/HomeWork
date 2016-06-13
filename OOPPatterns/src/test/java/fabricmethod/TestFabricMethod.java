package fabricmethod;

import org.junit.Assert;
import org.junit.Test;

public class TestFabricMethod extends Assert{
    @Test
    public void test() {
        PizzaStore nystore = new NYPizzaStore();
        PizzaStore chstore = new ChicagoPizzaStore();

        Pizza pizza = nystore.orderPizza("cheese");
        System.out.println("Order " + pizza.getName());
        pizza = chstore.orderPizza("cheese");
        System.out.println("Order " + pizza.getName());
    }
}
