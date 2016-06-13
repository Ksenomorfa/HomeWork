package abstractfabric;

class NYPizzaStore extends PizzaStore {

    public Pizza createPizza(String type) {
        Pizza pizza =null;
        PizzaIngredientFactory pizzaIngredientFactory = new NYPizzaIngredientFactory();
        switch (type) {
            case "cheese":
                pizza = new CheesePizza(pizzaIngredientFactory);
                pizza.setName("NY Cheese Pizza");
                break;
            case "pepperoni":
                pizza = new PepperoniPizza(pizzaIngredientFactory);
                pizza.setName("NY Pepperoni Pizza");
                break;
            case "clam":
                pizza = new ClamPizza(pizzaIngredientFactory);
                pizza.setName("NY Clam Pizza");
                break;
            case "veggie":
                pizza = new VeggiesPizza(pizzaIngredientFactory);
                pizza.setName("NY Veggie Pizza");
                break;
        }
        return pizza;
    }
}
