package state;

public class NoQuarterState implements State {
    GumballMashine gumballMashine;

    public NoQuarterState (GumballMashine gumballMashine) {
        this.gumballMashine = gumballMashine;
    }
    public void insertQuarter() {
        System.out.println("You inserted quarter");
        gumballMashine.setState(gumballMashine.getHasQuarterState());
    }

    public void ejectQuarter(){
        System.out.println("You haven't inserted a quarter");
    }

    public void turnCrank(){
        System.out.println("You turned but there's no quarter");
    }

    public void dispense(){
        System.out.println("You need to pay first");
    }
}
