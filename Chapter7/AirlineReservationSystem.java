package Chapter7;

import java.security.SecureRandom;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Random;
import java.util.Scanner;

public class AirlineReservationSystem {
    private final boolean[] SEATS = new boolean[10];
    private final int FIRST_CLASS = 1;
    private final int ECONOMY = 2;
    private final boolean BOOK_SEAT = true;
    private static int numberOfSeatsBookedInFirstClass = 0;
    private static int numberOfSeatsBookedInEconomy = 0;
    private String firstName;
    private String lastName;
    private String location;
    private String destination;

    int userChoice = 0;
    int userNumber = 0;
    Scanner scanner = new Scanner(System.in);



    public void promptUser(){
        String choice;
        do {
            System.out.println();
            System.out.println("Welcome to Legends Airways!");
            System.out.println("Please type 1 - First Class || 2 - Economy.");
            userChoice = scanner.nextInt();
            if ((userChoice == FIRST_CLASS) && (numberOfSeatsBookedInFirstClass == 5)) {
                firstClassFullyBooked();
            }
            if (userChoice == FIRST_CLASS) {
                firstClassBooking();
            }
            else if (userChoice == ECONOMY) {
                economyBooking();
            }
            else {
                promptUserAgain();
            }
            System.out.println("\nNext Customer? Yes/No");
            choice = scanner.next();
        } while (choice.equalsIgnoreCase("Yes"));
    }

    private void promptUserAgain() {
        System.out.println("Welcome to Dana Airways!");
        System.out.println("Please type 1 - First Class || 2 - Economy.");
        userChoice = scanner.nextInt();
        if (userChoice == FIRST_CLASS) {
            firstClassBooking();
        }
        else if (userChoice == ECONOMY){
            economyBooking();
        }
        else {
            promptUser();
        }
    }

    public void firstClassBooking() {
        passengerDetails();
        for (int i = 0; i < SEATS.length - 4; i++) {
            if (!SEATS[i]) {
                SEATS[i] = BOOK_SEAT;
                i = userNumber;
                numberOfSeatsBookedInFirstClass++;
                break;
            }
        }
        System.out.println("\nBooking successful!");
        System.out.println();
        firstClassBoardingPass();


    }
    public void economyBooking() {
        for (int i = 5; i < SEATS.length; i++) {
            if (!SEATS[i]) {
                SEATS[i] = BOOK_SEAT;
                i = userNumber;
                numberOfSeatsBookedInEconomy++;
                break;
            }
        }
        //economyFullyBooked();
    }
    public void firstClassFullyBooked(){
        String choice;
        System.out.println("First Class seats are fully booked. Would you like to be placed on Economy booking?");
        choice = scanner.next();
        if (choice.equalsIgnoreCase("Yes")) {
                economyBooking();
        }
         else {
            System.out.println("Next flight leaves in three hours.");
            System.exit(14);
        }
    }

    public void economyFullyBooked(){
        String choice;
        if (numberOfSeatsBookedInFirstClass == SEATS.length){
            System.out.println("Economy seats are fully booked. Would you like to be placed on First Class booking?");
            choice = scanner.nextLine();
            if (choice.equalsIgnoreCase("Yes")) {
               firstClassBooking();
            }
        } else {
            System.out.println("Next flight leaves in three hours.");
        }
    }

    public int getNumberOfSeatsBookedInFirstClass (){
        return numberOfSeatsBookedInFirstClass;
    }
    public int getNumberOfSeatsBookedInEconomy (){
        return numberOfSeatsBookedInEconomy;
    }
    public String getFirstName() { return firstName; }
    public String getLastName() { return lastName; }
    public String getLocation() { return location; }
    public String getDestination() { return destination; }


    public void passengerDetails() {
        System.out.println();
        System.out.print("First Name: ");
        this.firstName = scanner.next();
        System.out.print("Last Name: ");
        this.lastName = scanner.next();
        System.out.print("Location: ");
        this.location = scanner.next();
        System.out.print("Destination: ");
        this.destination = scanner.next();
    }


    public String timeAndDate() {
        SimpleDateFormat format = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
        Date date = new Date();
        return format.format(date);
    }

    public int eTicketNumber(){
        Random random = new Random();
        return random.nextInt(10000,999999);
    }

    public void firstClassBoardingPass(){
        System.out.println("------------------------------");
        System.out.println("\t\tBOARDING PASS");
        System.out.println("------------------------------");
        System.out.println("NAME - " + getFirstName() + " " + getLastName());
        System.out.println("------------------------------");
        System.out.println("LOCATION - " + getLocation());
        System.out.println("------------------------------");
        System.out.println("DESTINATION - " + getDestination());
        System.out.println("------------------------------");
        System.out.println("e-Ticket number - " + eTicketNumber());
        System.out.println("------------------------------");
        System.out.println("PLANE SECTION - FIRST CLASS");
        System.out.println("------------------------------");
        System.out.println("SEAT NUMBER - " + numberOfSeatsBookedInFirstClass);
        System.out.println("------------------------------");
        System.out.println("BOOKING DATE AND TIME - " + timeAndDate());
    }


}
