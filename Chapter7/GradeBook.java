package Chapter7;

public class GradeBook {
    private int[][] grades;
    private final String courseName;



    public GradeBook (int[][] grades, String courseName) {
        this.grades = grades;
        this.courseName = courseName;
    }

    public String getCourseName(){
        return courseName;
    }

    public void maximum(){

        int maximum = grades[0][0];
        for (int i = 0; i < grades.length; i++) {
            for (int j = 0; j < grades[i].length; j++) {
                if (grades[i][j] > maximum){
                    maximum = grades[i][j];
                }
            }
        }
        System.out.println("The highest grade in the grade book is " + maximum);
    }
    public void minimum (){
        int minimum = grades[0][0];
        for (int i = 0; i < grades.length; i++) {
            for (int j = 0; j < grades[i].length; j++) {
                if(grades[i][j] < grades[0][0]) {
                    minimum = grades[i][j];
                }
            }
        }
        System.out.println("The lowest grade in the grade book is " + minimum);
    }
    public void display(){
        int sum = 0;
        double average = 0.0;
        System.out.println("The grades are;");
        System.out.printf("%20s%10s%10s%10s%n", "Exam 1", "Exam 2", "Exam 3", "Average");
        for (int i = 0; i < grades.length; i++) {
            System.out.print("Student " +(1+i));
            for (int j = 0; j < grades[i].length; j++) {
                sum += grades[i][j];
                average = (double) sum / grades.length;
                System.out.printf("%10d", grades[i][j]);
            }
            System.out.printf("%10.2f", average);
            System.out.println();
            sum = 0;
            average = 0.0;
        }
    }
    public void bar(){
        System.out.println("Representing the statistics in a bar chat.");
        int[] frequency = new int[11];

        for (int i = 0; i < grades.length; i++) {
            for (int j = 0; j < grades[i].length; j++) {
               ++frequency[grades[i][j] / 10];
            }
        }
        for (int count = 0; count < frequency.length; count++) {
            if (count == 10) {
                System.out.printf("%5d: ", 100);
            }
            else {
                System.out.printf("%02d-%02d: ", count * 10, count * 10 + 9);
            }
            for (int stars = 0; stars < frequency[count]; stars++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
    public void output(){
        display();
        System.out.println();
        minimum();
        maximum();
        System.out.println();
        bar();
    }


}
