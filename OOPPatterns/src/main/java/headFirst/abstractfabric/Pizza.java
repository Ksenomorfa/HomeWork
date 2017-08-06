package abstractfabric;

public abstract class Pizza {
    String name;
    Dough dough;
    Sauce sauce;
    Veggies veggies[];
    Cheese cheese;
    Clams clams;
    Pepperoni pepperoni;

    abstract void prepare();

    void bake() {
        System.out.println("Bake for 25 minutes at 350");
    }

    void cut() {
        System.out.println("Cutting Pizza into diagonal slices.");
    }

    void box() {
        System.out.println("Place pizza in official box.");
    }

    void setName(String name) {
        this.name = name;
    }
    String getName() {
        return name;
    }
    public String toString() {
        //
        return "";
    }
}
