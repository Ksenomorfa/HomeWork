package iterator;

import java.util.*;
import java.util.Iterator;

public class PancakeMenu implements Menu {
    ArrayList menuItems;

    public PancakeMenu() {
        menuItems = new ArrayList();
        addItem("VegetarianPancake", "Good", true, 2.99);
        addItem("Not VegetarianPancake", "Bad or Good", false, 3.99);
    }

    private void addItem(String name, String description, boolean vegetarian, double price) {
        MenuItem menuItem = new MenuItem(name, description, vegetarian, price);
        menuItems.add(menuItem);
    }

    public Iterator createIterator() {
        return menuItems.iterator();
    }
}
