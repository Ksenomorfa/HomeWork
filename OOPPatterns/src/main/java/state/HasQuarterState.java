package state;

import java.util.Random;

public class HasQuarterState implements State {
    GumballMashine gumballMashine;
    Random randomWinner = new Random(System.currentTimeMillis());

    public HasQuarterState(GumballMashine gumballMashine) {
        this.gumballMashine = gumballMashine;
    }

    public void insertQuarter() {
        System.out.println("You can't insert another quarter");
    }

    public void ejectQuarter() {
        System.out.println("Quarter returned");
        gumballMashine.setState(gumballMashine.getNoQuarterState());
    }

    public void turnCrank() {
        System.out.println("You turned...");
        int winner = randomWinner.nextInt(10);
        if ((winner == 0) && (gumballMashine.getCount() > 1)) {
            gumballMashine.setState(gumballMashine.getWinnerState());
        } else {
            gumballMashine.setState(gumballMashine.getSoldState());
        }
    }

    public void dispense() {
        System.out.println("No gumball dispenced");
    }
}
