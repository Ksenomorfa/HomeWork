package state;

import org.junit.Assert;
import org.junit.Test;

public class GumballTesting extends Assert {
    @Test
    public void test() {
        GumballMashine gumballMashine = new GumballMashine(15);

        System.out.println(gumballMashine);

        gumballMashine.insertQuarter();
        gumballMashine.turnCrank();

        System.out.println(gumballMashine);

        gumballMashine.insertQuarter();
        gumballMashine.turnCrank();
        gumballMashine.insertQuarter();
        gumballMashine.turnCrank();
        gumballMashine.insertQuarter();
        gumballMashine.turnCrank();
        gumballMashine.insertQuarter();
        gumballMashine.turnCrank();
        gumballMashine.insertQuarter();
        gumballMashine.turnCrank();
        gumballMashine.insertQuarter();
        gumballMashine.turnCrank();

        System.out.println(gumballMashine);

        gumballMashine.refill(100);
        System.out.println(gumballMashine);

    }
}
