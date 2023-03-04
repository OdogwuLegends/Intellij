package FreeStyle;

import java.util.Scanner;

public class AirPeaceMain {
    public static void main(String[] args) {
        AirPeace peace = new AirPeace();
        System.out.println("Please type 1 for First Class and 2 for Economy.");
        Scanner scanner = new Scanner(System.in);
        int choice = scanner.nextInt();
        peace.assignSeat(choice);
    }
}
