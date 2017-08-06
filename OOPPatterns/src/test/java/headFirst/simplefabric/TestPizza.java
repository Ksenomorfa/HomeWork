package simplefabric;

import org.junit.Assert;
import org.junit.Test;

public class TestPizza extends Assert{
    @Test
    public void test() {
        SimplePizzaFabric simplePizzaFabric = new SimplePizzaFabric();
        PizzaStore pizzaStore = new PizzaStore(simplePizzaFabric);
        pizzaStore.orderPizza("cheese");
        pizzaStore.orderPizza("veggie");
        }
}
