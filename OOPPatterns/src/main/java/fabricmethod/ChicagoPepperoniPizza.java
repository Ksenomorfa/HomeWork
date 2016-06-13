package fabricmethod;


class ChicagoPepperoniPizza extends Pizza {
    ChicagoPepperoniPizza() {
        name = "Chicago Pepperoni Pizza";
        sauce = "Plum Tomato";
        dough = "Extra Thick Crust";
        toppings.add("Shredded Pepperoni");
    }
    void cut() {
        System.out.println("Cutting the pizza into square slices");
    }
}
