package task1;

public class Calculator {
    public double calcullate(double number1, double number2) {
        if (number1 > number2){
            return number1 + number2;
        } else if (number1 < number2) {
            return number1 * number2;
        } else {
            return Math.pow(number1,2);
        }
    }

}
