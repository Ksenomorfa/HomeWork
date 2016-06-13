package fabricmethod;


class ChicagoClamPizza extends Pizza {
    ChicagoClamPizza() {
        name = "Chicago Clam Pizza";
        sauce = "Plum Tomato";
        dough = "Extra Thick Crust";
        toppings.add("Shredded Clams");
    }
    void cut() {
        System.out.println("Cutting the pizza into square slices");
    }
}
