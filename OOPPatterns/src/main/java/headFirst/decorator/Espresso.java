package decorator;

class Espresso extends Beverage {
    Espresso() {
        description = "Espresso";
    }
    public double cost() {
        return 1.99;
    }
}
