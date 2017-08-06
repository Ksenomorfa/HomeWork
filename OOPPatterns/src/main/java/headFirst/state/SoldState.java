package state;

public class SoldState implements State {
    GumballMashine gumballMashine;

    public SoldState(GumballMashine gumballMashine) {
        this.gumballMashine = gumballMashine;
    }

    public void insertQuarter() {
        System.out.println("Please wait, we've already giving you a gumball");
    }

    public void ejectQuarter() {
        System.out.println("Sorry, you already turned a crunk");
    }

    public void turnCrank() {
        System.out.println("Turning twice don't get you a gumball");
    }

    public void dispense() {
        gumballMashine.releaseBall();
        if (gumballMashine.getCount() > 0) {
            gumballMashine.setState(gumballMashine.getNoQuarterState());
        } else {
            System.out.println("Oops, out of gumballs");
            gumballMashine.setState(gumballMashine.getSoldOutState());
        }
    }
}
