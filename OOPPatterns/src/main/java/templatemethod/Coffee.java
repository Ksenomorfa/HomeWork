package templatemethod;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Coffee extends CaffeineBeverage {

    void brew() {
        System.out.println("Brewing coffee");
    }

    void addCondiments() {
        System.out.println("Adding Sugar and Milk");
    }

    public boolean customerWantsCondiments() {
        String answer = getUserInput();

        if (answer.toLowerCase().startsWith("y")) {
            return true;
        } else {
            return false;
        }
    }

    private String getUserInput() {
        String answer = null;
        System.out.println("Would you like milk and sugar (y/n)? ");
        Scanner scanner = new Scanner(System.in);
        answer = scanner.nextLine();
        if (answer == null) {
            return "no";
        }
        return answer;
    }
}

