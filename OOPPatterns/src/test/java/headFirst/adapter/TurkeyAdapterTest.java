package adapter;

import org.junit.Assert;
import org.junit.Test;

public class TurkeyAdapterTest extends Assert{
    @Test
    public void test() {
        MallasdDuck duck = new MallasdDuck();
        WildTurkey turkey = new WildTurkey();
        Duck turkeyAdapter = new TurkeyAdapter(turkey);

        System.out.println("Turkey says...");
        turkey.gobble();
        turkey.fly();

        System.out.println("Duck says...");
        testDuck(duck);

        System.out.println("Turkey Adapter says...");
        testDuck(turkeyAdapter);

    }
    static void testDuck (Duck duck) {
        duck.quack();
        duck.fly();
    }
}
