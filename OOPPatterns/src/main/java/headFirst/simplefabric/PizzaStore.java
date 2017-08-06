package simplefabric;

class PizzaStore{
    private SimplePizzaFabric fabric;
    PizzaStore(SimplePizzaFabric fabric) {
        this.fabric = fabric;
    }
    Pizza orderPizza(String type) {
        Pizza pizza;
        pizza = fabric.createPizza(type);
        System.out.println(pizza.getName());
        pizza.prepare();
        pizza.bake();
        pizza.cut();
        pizza.box();
        return pizza;
    }
}
