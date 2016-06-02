package HomeWork020616;

import org.junit.Test;

import java.util.ArrayList;

/**
 * Created by p.bevad.spb on 02.06.2016.
 */
public class MyStack {
    ArrayList arrayList;

    public MyStack() {
        arrayList = new ArrayList<Object>();
    }

    public void push(Object obj) {
         arrayList.add(obj);
        System.out.println("Добавили: " + obj);
    }

    public Object pop() {
        Object obj = arrayList.get(arrayList.size()-1);
        obj = arrayList.remove(arrayList.size()-1);
        System.out.println("Забрали: " + obj);
        return obj;
    }
    public void printStack() {
        if (arrayList.size()!=0) {
            for (int i = 0; i < arrayList.size(); i++) {
                System.out.println("Индекс:" + i + " Элемент: " + arrayList.get(i));
            }
        }
        else System.out.println("Стек пуст");
    }
}
