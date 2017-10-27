package lesson5.loops.power;

public class PowerCalculatorTest {

    public static void main(String[] args) {
        PowerCalculator calculator = new PowerCalculator();
        System.out.println(calculator.calculate(5, 2));
        System.out.println(calculator.calculate(-5, 2));
        System.out.println(calculator.calculate(-1, 3));
        System.out.println(calculator.calculate(2, -1));
        System.out.println(calculator.calculate(2, -2));
    }

}
