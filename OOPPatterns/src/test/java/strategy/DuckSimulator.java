package strategy;

import org.junit.Assert;
import org.junit.Test;

public class DuckSimulator extends Assert {
    @Test
    public void test() {
        Duck mallard = new MallardDuck();
        mallard.performFly();
        mallard.performQuack();

        Duck modelDuck = new ModelDuck();
        modelDuck.performFly();
        modelDuck.setFlyBehavior(new FlyWithRockets());
        modelDuck.performFly();

    }
}
