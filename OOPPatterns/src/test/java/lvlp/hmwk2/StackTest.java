package lvlp.hmwk2;

import org.junit.Assert;
import org.junit.Test;

import java.util.Date;


/**
 * Стек по домашнему заданию
 */
public class StackTest extends Assert {
    @Test
    public void test1() {
        //Задаем стек
        MyStack stack = new MyStack();
        Date now = new Date();
        //задаем как один из добавляемых элементов массив
        int[] massive = new int[]{1, 2, 4};
        //добавляем разные элементы
        stack.push(1);
        stack.push("строчка");
        stack.push(3);
        stack.push(massive);

        //выводим содержимое стека
        System.out.println("Содержимое стека:");
        stack.printStack();
        System.out.println("============");
        //добавлеяем и забираем еще
        stack.push(now);
        assertEquals(now, stack.pop());
        stack.push(null);

        //выводим содержимое стека
        System.out.println("Содержимое стека:");
        stack.printStack();
        System.out.println("============");
        //проверяем забор элементов
        assertEquals(null, stack.pop());
        assertEquals(massive, stack.pop());

        assertEquals(3, stack.pop());
        System.out.println("Содержимое стека:");
        stack.printStack();
        System.out.println("============");
        assertEquals("строчка", stack.pop());
        assertEquals(1, stack.pop());
        System.out.println("============");
        //проверка пустого стека:
        System.out.println("Содержимое стека:");
        assertEquals(null, stack.pop());



    }
}
