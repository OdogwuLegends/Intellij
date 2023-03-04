package FreeStyle;

import java.util.Scanner;

public class AirPeace {
private boolean[] seats = new boolean[10];

public void assignSeat(int choice) {
    int seatNumber = -1;
    if (choice == 1) {
        for (int i = 0; i < 5; i++) {
            if (seats[i] == false) {
                seatNumber = i;
                seats[i] = true;
                break;
            }
        }
        if (seatNumber == -1) {
            System.out.println("First class section is full. Do you want to be placed in the Economy section? (yes/no)");
            Scanner scanner = new Scanner(System.in);
            String response = scanner.next();
            if (response.equals("yes")) {
                assignSeat(2);
            } else {
                System.out.println("Next flight leaves in 3 hours.");
            }
        } else {
            System.out.println("First class. Seat number: " + (seatNumber + 1));
        }
    } else if (choice == 2) {
        for (int i = 5; i < 10; i++) {
            if (seats[i] == false) {
                seatNumber = i;
                seats[i] = true;
                break;
            }
        }
        if (seatNumber == -1) {
            System.out.println("Economy section is full. Do you want to be placed in the First class section? (yes/no)");
            Scanner scanner = new Scanner(System.in);
            String response = scanner.next();
            if (response.equals("yes")) {
                assignSeat(1);
            } else {
                System.out.println("Next flight leaves in 3 hours.");
            }
        } else {
            System.out.println("Economy. Seat number: " + (seatNumber + 1));
            }
        }
    }
}
