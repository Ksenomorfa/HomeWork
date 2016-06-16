package composite;

import org.junit.Assert;
import org.junit.Test;

public class CompositeTest extends Assert {
    @Test
    public void test() {
        MenuComponent pancakeMenu = new Menu("Pancake Menu", "Breakfast");
        MenuComponent cafeMenu = new Menu("Cafe Menu", "Dinner");
        MenuComponent dinerMenu = new Menu("Diner Menu", "Lunch");
        MenuComponent desertMenu = new Menu("Desert Menu", "Desert");

        MenuComponent allMenus = new Menu("All Menus", "all combined");

        allMenus.add(pancakeMenu);
        allMenus.add(cafeMenu);
        allMenus.add(dinerMenu);
        allMenus.add(pancakeMenu);

        dinerMenu.add(new MenuItem("Pasta", "slighty", true, 3.80));
        dinerMenu.add(desertMenu);
        desertMenu.add(new MenuItem("Desert of wine", "desc", false, 4));
        Waitress waitress = new Waitress(allMenus);
        waitress.printMenu();
        waitress.printVegeratarianMenu();

    }
}
