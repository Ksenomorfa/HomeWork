package state;

public class SoldOutState implements State {
    GumballMashine gumballMashine;

    public SoldOutState(GumballMashine gumballMashine) {
        this.gumballMashine = gumballMashine;
    }

    public void insertQuarter() {
        System.out.println("The machine is sold out, you can't insert quarter");
    }

    public void ejectQuarter() {
        System.out.println("You can't eject, you haven't inserted a quarter yet");
    }

    public void turnCrank() {
        System.out.println("You turned but there's no gumballs");
    }

    public void dispense() {
        System.out.println("No gumball dispenced");
    }
}
