package state;

import iterator.PancakeMenu;

import javax.naming.spi.StateFactory;

public class GumballMashine {
    State soldOutState;
    State noQuarterState;
    State hasQuarterState;
    State soldState;
    State winnerState;

    State state = soldOutState;

    int count = 0;


    public GumballMashine(int numberOfGumballs) {
        soldOutState = new SoldOutState(this);
        soldState = new SoldState(this);
        noQuarterState = new NoQuarterState(this);
        hasQuarterState = new HasQuarterState(this);
        winnerState = new WinnerState(this);
        this.count = numberOfGumballs;
        if (numberOfGumballs > 0) {
            state = noQuarterState;
        }
    }

    public void insertQuarter() {
        state.insertQuarter();
    }


    public void ejectQuarter() {
        state.ejectQuarter();

    }

    public void turnCrank() {
        state.turnCrank();
        state.dispense();
    }

    void refill (int numberOfFill) {
        this.count = count + numberOfFill;
        state = noQuarterState;
    }
    void setState(State state) {
        this.state = state;
    }

    void releaseBall() {
        System.out.println("A gumball comes...");
        if (count != 0) {
            count = count - 1;
        }
    }

    State getNoQuarterState() {
        return noQuarterState;
    }

    State getSoldOutState() {
        return soldOutState;
    }

    State getHasQuarterState() {
        return hasQuarterState;
    }

    State getSoldState() {
        return soldState;
    }

    State getWinnerState() {
        return winnerState;
    }

    State getState() {
        return state;
    }

    int getCount() {
        return count;
    }


    public String toString() {
        return "State = " + this.state + ", Count = " + this.count;
    }
}
