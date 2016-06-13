package decorator;

class DarkRoast extends Beverage {
    DarkRoast() {
        description = "DarkRoast";
    }
    public double cost() {
        return .99;
    }
}
