package strategy;

public class FlyWithRockets implements FlyBehavior {
    @Override
    public void fly() {
        System.out.println("I'm fly with rockets");
    }
}
