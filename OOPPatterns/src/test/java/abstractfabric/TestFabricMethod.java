package abstractfabric;

import org.junit.Assert;
import org.junit.Test;

public class TestFabricMethod extends Assert {
    @Test
    public void test() {
        PizzaStore nystore = new NYPizzaStore();

        Pizza pizza = nystore.orderPizza("cheese");
        System.out.println("Order " + pizza.getName());

    }
}
