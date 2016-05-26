package HomeWork1Lesson;

import java.util.Scanner;

/**
 * Created by p.bevad.spb on 26.05.2016.
 */
public class RecursionN {
    static int N;
    static int[] list = new int[100];

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Введите N: ");
        if (((N = s.nextInt()) <= 100)&&(N>0)) {
            RecursionN.calcRecursion(N, N, 0);
        } else if (N<0) System.out.println("N меньше 0, вычислять нечего.");
        else System.out.println("N больше 100  слишком долго вычислять.");
    }

    public static void calcRecursion(int summa, int prev, int id) {

        // Честно, алгоритм пришлось искать...
        // перебираем и рекурсивно добавляем в массив, начиная с наибольшего числа
        for (int x = Math.min(summa, prev); x >= 1; x--) {
            //сначала пишет для id текущий мин. элемент
            list[id] = x;
            //идем в рекурсию с остатком суммы
            calcRecursion(summa - x, x, id + 1);
        }
        //если сумма равна 0, начинаем выыводить строку
        if (summa == 0) {
            //выводим само N
            System.out.print("N = " + list[0]);
            //выводим слагаемые из массива в ту же строку
            for (int i = 1; i < id; i++) {
                System.out.print(" + " + list[i]);
            }
            System.out.println();
            return;
        }

    }
}

