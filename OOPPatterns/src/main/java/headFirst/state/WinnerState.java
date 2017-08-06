package state;

public class WinnerState implements State {
    GumballMashine gumballMashine;

    public WinnerState(GumballMashine gumballMashine) {
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
        System.out.println("You are WINNER!");
        gumballMashine.releaseBall();
        if (gumballMashine.getCount() == 0) {
            gumballMashine.setState(gumballMashine.getSoldOutState());
        } else {
            gumballMashine.releaseBall();
            if (gumballMashine.getCount() > 0) {
                gumballMashine.setState(gumballMashine.getNoQuarterState());
            } else {
                System.out.println("Ooops,out off gumballs");
                gumballMashine.setState(gumballMashine.getSoldOutState());
            }
        }
    }
}
