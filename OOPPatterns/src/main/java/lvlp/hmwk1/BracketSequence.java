package lvlp.hmwk1;

import java.util.Scanner;

/**
 * Created by p.bevad.spb on 26.05.2016.
 */
public class BracketSequence {
    static int N;

    //Вводим N с клавиатуры
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Введите N: ");
        //проверяем, что N больше 1
        if ((N = s.nextInt()) < 1) {
            System.out.println("N меньше 0, вычислять нечего");
        } else {
            BracketSequence.makeBrack(N);
        }
    }

    static void makeBrack(int N) {
        System.out.println("N = " + N);
        makeBrack(N, "", 0, 0);
    }

    static void makeBrack(int N, String str, int openCr, int closeCr) {
        //проверяем, что кол-во скобок открытых и закрытых одинаково, тогда выдаем строку
        // алгоритм есть на ifmo
        if (check(N, openCr, closeCr)) {
            System.out.println(str);
            return;
        }
        //рекурсивно проверяем случаи, когда открытых меньше N, тогда добавляем скобку  и увеличиваем кол-во открытых
        if (openCr < N) {
            makeBrack(N, str + "(", openCr + 1, closeCr);
        }
        //рекурсивно проверяем случаи, когда закрытых меньше N, тогда добавляем скобку  и увеличиваем кол-во закрытых
        if (closeCr < openCr) {
            makeBrack(N, str + ")", openCr, closeCr + 1);
        }
    }

    static boolean check(int N, int openCr, int closeCr) {
        //проверка кол-ва скобок для строки
        return ((openCr + closeCr == 2 * N)) ? true : false;
    }
}
