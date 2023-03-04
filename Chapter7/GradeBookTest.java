package Chapter7;

import java.util.Scanner;

public class GradeBookTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("How many students took the exams?");
        int numberOfStudents = scanner.nextInt();
        System.out.println("How many exams were written?");
        int numberOfExams = scanner.nextInt();

        System.out.print("Please enter the scores: ");

        int [][] ArrayGrades = new int[numberOfStudents][numberOfExams];

        for (int i = 0; i < ArrayGrades.length; i++) {
            for (int j = 0; j < ArrayGrades[i].length; j++) {
                int scoresOfStudents = scanner.nextInt();
                ArrayGrades[i][j] = scoresOfStudents;
            }
        }

        GradeBook book = new GradeBook(ArrayGrades, "Coding with Grace - 101.");
        book.output();

        System.out.println();
        System.out.println("That is all on " +book.getCourseName());
    }
}
