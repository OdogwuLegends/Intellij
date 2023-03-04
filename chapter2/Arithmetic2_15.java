package chapter2;

import java.util.Scanner;

public class Arithmetic2_15 {
    Scanner input = new Scanner(System.in);
    int firstInteger;
    int secondInteger;


    public void calculate(){
        prompt();
        squareOfFirstInput(firstInteger);
        squareOfSecondInput(secondInteger);
        sumOfSquares(firstInteger, secondInteger);
        differenceOfSquares(secondInteger,firstInteger);
    }
    public boolean prompt() {
        System.out.println("Please enter two integers: ");
        firstInteger = input.nextInt();
        secondInteger = input.nextInt();
        return true;
    }


    public int squareOfFirstInput(int firstInteger) {
        this.firstInteger = firstInteger;
        int squareOne = firstInteger * firstInteger;
        System.out.println("The square of first integer is " + squareOne);
        return squareOne;
    }

    public int squareOfSecondInput(int secondInteger) {
        this.secondInteger = secondInteger;
        int squareTwo = secondInteger * secondInteger;
        System.out.println("The square of the second integer is " + squareTwo);
        return squareTwo;
    }


    public int sumOfSquares(int firstInteger, int secondInteger) {
        this.firstInteger = firstInteger;
        this.secondInteger = secondInteger;

        int sum = (firstInteger * firstInteger) + (secondInteger * secondInteger);
        System.out.println("\nThe sum of the squares are " + sum);
        return sum;
    }

    public int differenceOfSquares(int secondInteger, int firstInteger) {
        this.secondInteger = secondInteger;
        this.firstInteger = firstInteger;

        int difference =  (secondInteger * secondInteger) - (firstInteger * firstInteger);
        System.out.println("\nThe difference of both squares is " + difference);
        return difference;
    }
}
