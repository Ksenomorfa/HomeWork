package iterator;

import java.util.*;

public class CafeMenu implements Menu {
    Hashtable menuItems = new Hashtable();

    public CafeMenu () {
        addItem("VegetarianDiner", "Good", true, 2.99);
        addItem("Not VegetarianDiner", "Bad or Good", false, 3.99);
    }
    private void addItem(String name, String description, boolean vegetarian, double price) {
        MenuItem menuItem = new MenuItem(name, description, vegetarian, price);
        menuItems.put(menuItem.getName(), menuItem);
    }

    public java.util.Iterator createIterator() {
        return menuItems.values().iterator();
    }
}
