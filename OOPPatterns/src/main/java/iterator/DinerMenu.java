package iterator;

public class DinerMenu implements Menu {
    static final int MAX_VALUE = 6;
    int numberOfItems;
    MenuItem[] menuItems;

    public DinerMenu () {
        menuItems = new MenuItem[MAX_VALUE];
        addItem("VegetarianDiner", "Good", true, 2.99);
        addItem("Not VegetarianDiner", "Bad or Good", false, 3.99);
    }

    private void addItem(String name, String description, boolean vegetarian, double price) {
        MenuItem menuItem = new MenuItem(name, description, vegetarian, price);
        if (numberOfItems>=MAX_VALUE) {
            System.out.println("Sorry, menu is full.");
        }
        else {
            menuItems[numberOfItems] = menuItem;
            numberOfItems = numberOfItems+1;
        }
    }
    public java.util.Iterator createIterator() {
        return new DinerMenuIterator(menuItems);
    }
}
