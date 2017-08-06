package lvlp.hmwk1;

import org.junit.Assert;
import org.junit.Test;

/**
 * Not Default
 */
public class QuadrationTest extends Assert {
    @Test
    public void test() {

        assertEquals("D меньше 0, корней нет", Quadration.calc(2,4,7));

        assertEquals("x равен 2,0000", Quadration.calc (1,-4,4));

        assertEquals("x1 равен 0,5000 x2 равен -3,0000", Quadration.calc(2,5,-3));
        assertEquals("x1 равен -0,2500 x2 равен -5,0000", Quadration.calc(4,21,5));
        assertEquals("x1 равен 3,0000 x2 равен 0,3333", Quadration.calc(3,-10,3));

        assertEquals("x - любое число", Quadration.calc(0, 0, 0));

        assertEquals("Уравнение линейное, x равен 1,0000", Quadration.calc(0, 2, -2));
        assertEquals("Уравнение линейное, x равен 0,0000", Quadration.calc(0, 2, 0));

        assertEquals("Корней нет", Quadration.calc(0, 0, 5));

    }

}
