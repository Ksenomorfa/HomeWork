package HomeWork1Lesson;

/**
 * Not Default
 */

import java.util.Scanner;

public class Quadration {

    public static void main(String[] args) {


       Scanner s = new Scanner(System.in);
        System.out.println("Введите a:");
        if (s.hasNextDouble()) {
            double a = s.nextDouble();

            System.out.println("Введите b:");
            if (s.hasNextDouble()) {
                double b = s.nextDouble();

                System.out.println("Введите c:");
                if (s.hasNextDouble()) {
                    double c = s.nextDouble();

                    Quadration calcX = new Quadration();
                    String s2 = calcX.calc(a, b, c);
                    System.out.println("Результат: " + s2);
                }
                else System.out.println("Некорректное c");

            }
            else System.out.println("Некорректное b");
        }
        else System.out.println("Некорректное a");
    }
    //сделать отдельно методы calcD, calcX1, calcX2  и их тесты

    public static String calc(double a, double b, double c) {

        double D;
        if ((a == 0) && (b == 0) && (c == 0)) {
            return "x - любое число";
        }
        D = b * b - 4 * a * c;
        if (D == 0) {
            if (c==0) {
                return "x равен " + String.format("%.4f", (-b / (2 * a)));
            }
            else return "Корней нет";
        }
        if (D > 0) {
            double x1;
            double x2;
            if (a == 0) {
                x1 = (-c / b);
                return "Уравнение не квадратное, x равен " + String.format("%.4f", Math.abs(x1));
            }
            x1 = ((-b + Math.sqrt(D)) / (2 * a));
            x2 = ((-b - Math.sqrt(D)) / (2 * a));
            return "x1 равен " + String.format("%.4f", x1) + " x2 равен " + String.format("%.4f", x2);
        }
        return "D меньше 0, корней нет";
    }
}
