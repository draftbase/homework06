package task1;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj liczbę pierwszą:");
        double number1 = scanner.nextDouble();
        System.out.println("Podaj liczbę drugą:");
        double number2 = scanner.nextDouble();
        System.out.println("Wynik dzialania to: " + calculator.calcullate(number1,number2));

    }
}
