package iterator;

public class MenuItem {
    public String getName() {
        return name;
    }

    String name;

    public String getDescription() {
        return description;
    }

    String description;

    public boolean isVegetarian() {
        return vegetarian;
    }

    boolean vegetarian;

    public double getPrice() {
        return price;
    }

    double price;

    public MenuItem (String name, String description, boolean vegetarian, double price) {
        this.name = name;
        this.description = description;
        this.vegetarian = vegetarian;
        this.price = price;
    }


}
