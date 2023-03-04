package FreeStyle;

public class CourseMain {
    public static void main(String[] args) {
        Course firstCourse = new Course("Java");

        firstCourse.addStudent("Mykailo Mudrky");
        firstCourse.addStudent("Enzo Fernandez");
        firstCourse.addStudent("Noni Madueke");
        firstCourse.addStudent("Romelu Lukaku");

        String[] students = firstCourse.getStudents();
        System.out.println("The students in the first course are; ");
        for (int i = 0; i < firstCourse.getNumberOfStudents(); i++) {
            System.out.println(students[i]);
        }
        System.out.println("The total number of students are " + firstCourse.getNumberOfStudents());
        System.out.println("\nWe shall remove Romelu Lukaku now.");
        firstCourse.dropStudent("Romelu Lukaku");
        System.out.println("\nThe total students in the first course now are " + firstCourse.getNumberOfStudents() + " and they are;");
        for (int i = 0; i < firstCourse.getNumberOfStudents(); i++) {
            System.out.println(students[i]);
        }
    }
}
