package HomeWork1Lesson;

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
        if ((N = s.nextInt()) < 1) {
            System.out.println("Вычислять нечего");
        } else {
            BracketSequence.makeBrack(N);
        }
    }

    static void makeBrack(int N) {
        System.out.println("N = " + N);
        makeBrack(N, "", 0, 0);
    }

    static void makeBrack(int N, String str, int openBr, int closeBr) {
        if ((openBr == N) && (closeBr == N)) {
            System.out.println(str);
            return;
        }
        if (openBr < N) {
            makeBrack(N, str + "(", openBr + 1, closeBr);
        }
        if (closeBr < openBr) {
            makeBrack(N, str + ")", openBr, closeBr + 1);
        }

    }
}
