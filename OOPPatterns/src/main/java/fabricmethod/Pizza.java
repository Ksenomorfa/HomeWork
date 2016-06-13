package fabricmethod;

import java.util.ArrayList;

public abstract class Pizza {
    String name;
    String dough;
    String sauce;
    ArrayList toppings = new ArrayList();

    public String getName() {
        return this.name;
    }

    void prepare() {
        System.out.println("Preparing " + name);
        System.out.println("Tossing dough...");
        System.out.println("Adding sauce...");
        System.out.println("Adding toppings...");
        for (Object topping : toppings) {
            System.out.println("   " + topping);
        }
    }

    void bake() {
        System.out.println("Bake for 25 minutes at 350 degrees.");
    }

    void cut() {
        System.out.println("Cutting Pizza into diagonal slices.");
    }

    void box() {
        System.out.println("Place pizza in official box.");
    }
}
