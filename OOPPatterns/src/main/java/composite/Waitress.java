package composite;

import java.util.Iterator;
import java.util.UnknownFormatConversionException;

public class Waitress {
    MenuComponent allMenus;

    public Waitress(MenuComponent allMenus) {
        this.allMenus = allMenus;
    }

    public void printMenu() {
        allMenus.print();
    }

    public void printVegeratarianMenu() {
        Iterator iterator = allMenus.createIterator();
        System.out.println("\n Vegetarian Menu");
        while (iterator.hasNext()) {
            MenuComponent component = (MenuComponent) iterator.next();
            try {
                if (component.isVegetarian()) {
                    component.print();
                }
            } catch (UnsupportedOperationException e) {}
        }
    }
}
