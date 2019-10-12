package task2;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Point point = new Point();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj X");
        point.setPointX(scanner.nextInt());
        System.out.println("Podaj Y");
        point.setPointY(scanner.nextInt());
        System.out.println("Punkt (" + point.getPointX() + ", " + point.getPointY() + ") leży w "
                + point.whichQuarter() + " ćwiartce układu współrzędnych.");
    }
}
