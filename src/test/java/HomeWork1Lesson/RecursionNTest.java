package HomeWork1Lesson;

import org.junit.Assert;
import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

/**
 * Тест к вычислению разложения на слагаемые.
 */
public class RecursionNTest extends Assert {
    @Test
    public void test1() {
        RecursionN2 rec = new RecursionN2(1);
        assertEquals(1, rec.N);
        //,берем байтовый поток в строчку
        ByteArrayOutputStream os = new ByteArrayOutputStream();
        System.setOut(new PrintStream(os));
        rec.gent();
        assertEquals("1 = 1\r\n", os.toString());


        //  в строку
    }

    @Test
    public void test2() {
        RecursionN2 rec = new RecursionN2(2);
        assertEquals(2, rec.N);
        //,берем байтовый поток в строчку
        ByteArrayOutputStream os = new ByteArrayOutputStream();
        System.setOut(new PrintStream(os));
        rec.gent();

        assertEquals("2 = 2\r\n 2 = 1 + 1 \r\n", os.toString());
    }

    //  в строку
    @Test
    public void testprint() {
        RecursionN2 rec = new RecursionN2(2);
        //,берем байтовый поток в строчку
        ByteArrayOutputStream os = new ByteArrayOutputStream();
        System.setOut(new PrintStream(os));
        int[] A = {1,1};
        rec.print(A,1);
        assertEquals("2 = 1 + 1\r\n", os.toString());
    }
    @Test
    public void test3() {
        RecursionN2 rec = new RecursionN2(3);
        assertEquals(3, rec.N);
        //,берем байтовый поток в строчку
        ByteArrayOutputStream os = new ByteArrayOutputStream();
        System.setOut(new PrintStream(os));
        rec.gent();

        assertEquals("3 = 3\r\n 3 = 2 + 1\r\n 3 = 1 + 1 + 1\r\n", os.toString());
    }


}

