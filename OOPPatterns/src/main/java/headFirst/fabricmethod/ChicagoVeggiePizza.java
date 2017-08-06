package fabricmethod;

class ChicagoVeggiePizza extends Pizza {
    ChicagoVeggiePizza() {
        name = "Chicago Veggie Pizza";
        sauce = "Plum Tomato";
        dough = "Extra Thick Crust";
        toppings.add("Shredded Veggies");
    }
    void cut() {
        System.out.println("Cutting the pizza into square slices");
    }
}
