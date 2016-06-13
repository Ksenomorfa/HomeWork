package abstractfabric;

import org.omg.CORBA.Object;

public class VeggiesPizza extends Pizza {
    PizzaIngredientFactory pizzaIngredientFactory;

    public VeggiesPizza(PizzaIngredientFactory pizzaIngredientFactory) {
        this.pizzaIngredientFactory = pizzaIngredientFactory;
    }

    void prepare() {
        System.out.println("Preparing " + name);
        dough = pizzaIngredientFactory.createDough();
        sauce = pizzaIngredientFactory.createSauce();
        cheese = pizzaIngredientFactory.createCheese();
        veggies = pizzaIngredientFactory.createVeggies();

    }
}
