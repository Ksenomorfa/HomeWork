package lvlp.hmwk1;

/**
 * Not Default
 */

import java.util.Scanner;

public class Quadration {

    public static void main(String[] args) {

       Scanner s = new Scanner(System.in);
        System.out.println("Введите a:");
        //проверяем корректность a,b,c - если плохие, выбрасываем из программы, без исключений
        if (s.hasNextDouble()) {
            double a = s.nextDouble();

            System.out.println("Введите b:");
            if (s.hasNextDouble()) {
                double b = s.nextDouble();

                System.out.println("Введите c:");
                if (s.hasNextDouble()) {
                    double c = s.nextDouble();
                    //все a,b,c - корретные, вычисляем:
                    String s2 = Quadration.calc(a, b, c);
                    System.out.println("Результат: " + s2);
                }
                else System.out.println("Некорректное c");

            }
            else System.out.println("Некорректное b");
        }
        else System.out.println("Некорректное a");
    }

    public static String calc(double a, double b, double c) {

        double D;
        if ((a == 0) && (b == 0) && (c == 0)) {
            System.out.println("Все введенные числа равны 0");
            return "x - любое число";
        }
        if ((a==0)&&(b==0)&&(c!=0)) {
            return "Корней нет";
        }
        //вычисляем квадрат дискриминанта:
        D = b * b - 4 * a * c;
        System.out.println ("Квадрат дискриминанта = b * b - 4 * a * c  и равен " + D);
        //если он равен 0, то для случая, если с=0 вычисляется проще
        if (D == 0) {
                return "x равен " + String.format("%.4f", (-b / (2 * a)));
        }
        if (D > 0) {
            double x1;
            double x2;
            if (a == 0) {
                x1 = (-c / b);
                System.out.println("x1 = (-c / b)");
                return "Уравнение линейное, x равен " + String.format("%.4f", Math.abs(x1));
            }
            x1 = ((-b + Math.sqrt(D)) / (2 * a));
            System.out.println("x1 = ((-b + корень(D)) / (2 * a))");
            x2 = ((-b - Math.sqrt(D)) / (2 * a));
            System.out.println("x2 = ((-b - корень(D)) / (2 * a))");
            return "x1 равен " + String.format("%.4f", x1) + " x2 равен " + String.format("%.4f", x2);
        }

        return "D меньше 0, корней нет";
    }
}
