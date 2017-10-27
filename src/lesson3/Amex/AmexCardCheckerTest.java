package lesson3.Amex;

import java.util.Scanner;

public class AmexCardCheckerTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
        AmexCardChecker visaCardChecker = new AmexCardChecker();
        String a = scanner.next();

        System.out.println(visaCardChecker.isAmex(a));


    }
}
