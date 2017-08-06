package singleton;

import org.junit.Assert;
import org.junit.Test;
import sun.management.jmxremote.SingleEntryRegistry;

public class SingletonTest extends Assert {
    @Test
    public void test() {
        //Создание через конструктор невозможно:
        //Singleton singleton = new Singleton();
        Singleton single = Singleton.getInstance();
        //Это дает нам тот же объект:
        Singleton single2 = Singleton.getInstance();
        System.out.println("Первый объект: " + single.toString() + " Второй объект, ссылка на него же: " + single2.toString());
    }
}
