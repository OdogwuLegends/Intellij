import java.util.Scanner;

public class CreditCardValidatorMain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //int[] array = {2,7,3,9,4,6,1,8,4,3,8};
        System.out.print("Please enter digits: ");
        int input = scanner.nextInt();
        int[] array = new int[input];
        int multiply = 1;
        int total = 0;

        for (int i = array.length-1; i >= 0; i-=2) {
            multiply = array[i] * 2;
            System.out.print(multiply + " ");
            total += multiply;
        }
        System.out.println("\nTotal is " + total);

    }
}
