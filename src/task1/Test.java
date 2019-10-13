package task1;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        double number1 = 3;
        double number2 = 2;
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Podaj liczbę pierwszą:");
//        calculator.setNumber1(scanner.nextDouble());
//        System.out.println("Podaj liczbę drugą:");
//        calculator.setNumber2(scanner.nextDouble());
        System.out.println("Wynik dzialania to: " + calculator.calcullate(number1,number2));

    }
}
