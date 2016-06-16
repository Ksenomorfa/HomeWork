package iterator;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;

public class IteratorTest extends Assert {
    @Test
    public void test() {
        PancakeMenu pancakeMenu = new PancakeMenu();
        DinerMenu dinerMenu = new DinerMenu();
        CafeMenu cafeMenu = new CafeMenu();

        ArrayList menus = new ArrayList();
        menus.add(pancakeMenu);
        menus.add(cafeMenu);
        menus.add(dinerMenu);

        Waitress waitress = new Waitress(menus);
        waitress.printMenu();
    }
}
