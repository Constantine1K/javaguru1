package lesson3.LightColorDetector;

import java.util.Scanner;

public class LightColorDetectorTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter wave number:");
        int wavelength = scanner.nextInt();
        LightColorDetector detector = new LightColorDetector();
        String detected = detector.detect(wavelength);
        System.out.println("wave length " + detected);
    }
}
