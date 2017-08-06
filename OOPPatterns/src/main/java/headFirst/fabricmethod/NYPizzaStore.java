package fabricmethod;

class NYPizzaStore extends PizzaStore {

    public Pizza createPizza(String type) {
        switch (type) {
            case "cheese":
                return new NYCheesePizza();
            case "pepperoni":
                return new NYPepperoniPizza();
            case "clam":
                return new NYClamPizza();
            case "veggie":
                return new NYVeggiePizza();
            default:
                return null;
        }
    }
}
