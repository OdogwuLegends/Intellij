package FreeStyle;

import java.security.SecureRandom;
import java.util.Random;
import java.util.Scanner;

public class jj {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter two numbers: ");
        int number1 = scanner.nextInt();
        int number2 = scanner.nextInt();

        if (number1 < number2) {
            number2 = number1;
            number1 = number2;
        }
        System.out.println("First number is " + number1);
        System.out.println("Second number is " + number2);

    }
}