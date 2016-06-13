package fabricmethod;


import java.io.IOException;

class ChicagoCheesePizza extends Pizza {
    ChicagoCheesePizza(){
        name = "Chicago Cheese Pizza";
        sauce = "Plum Tomato";
        dough = "Extra Thick Crust";
        toppings.add("Shredded Mozarella Cheese");
    }
    void cut() {
        System.out.println("Cutting the pizza into square slices");
    }
}
