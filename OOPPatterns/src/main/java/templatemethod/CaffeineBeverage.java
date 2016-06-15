package templatemethod;

public abstract class CaffeineBeverage {
    final void prepareReceipe() {
        boilWater();
        brew();
        pourInCup();
        if (customerWantsCondiments()) {
            addCondiments();
        }
    }

    abstract void addCondiments();

    void pourInCup() {
        System.out.println("Pouring in cup.");
    }

    abstract void brew();

    void boilWater() {
        System.out.println("Boiling water.");
    }

    boolean customerWantsCondiments() {
        return true;
    }
}
