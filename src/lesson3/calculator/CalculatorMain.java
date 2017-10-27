package lesson3.calculator;

public class CalculatorMain {

    public static void main(String[] args) {
        Calculator calculator = new Calculator();

        double first = 4;
        double second = 5;

        double result = calculator.sum(first, second);
        System.out.println("sum = " + result);

        result = calculator.subtract(first, second);
        System.out.println("difference = " + result);

        result = calculator.multiply(first, second);
        System.out.println("multiplication = " + result);

        result = calculator.divide(first, second);
        System.out.println("division = " + result);

    }

}
