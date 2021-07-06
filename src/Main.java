import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        double agesSum = 0;
        Scanner scanner = new Scanner(System.in);

        // Asks the user for the amount of students
        System.out.println("How many students are in your class?");
        int numberOfStudents = scanner.nextInt();
        // Makes the Student[] array students as large as the user specified
        Student[] students = new Student[numberOfStudents];



        // Makes user fill the array with name, age and hair color.
        for (int i = 0; i < students.length; i++) {
            scanner.nextLine(); // Doesn't work without this line, no idea why.
            /** Exception in thread "main" java.util.InputMismatchException **/

            // So user would be displayed Student 1 instead of Student 0

            System.out.println("Enter student " + (i+1) + " name: ");
            String studentName = scanner.nextLine();
            System.out.println("Enter student " + (i+1) + " age: ");
            int studentAge = scanner.nextInt();
            System.out.println("Enter student " + (i+1) + " hair color: ");
            String studentHairColor = scanner.next();

            students[i] = new Student(studentName, studentAge, studentHairColor);

            // Adds up only the ages the user enters.
            agesSum += students[i].getAge();
        }

        System.out.println('\n' + "This is your class of " + students.length + '\n' + Arrays.toString(students) + '\n');
        System.out.println("The sum of above ages is: " + agesSum);
        // Makes the studentsAge object to use studentAverageAge
        Average studentsAge = new Average();
        System.out.println("The average age of " + students.length + " students is: " +
                studentsAge.studentAverageAge(agesSum, students.length));
    }
}
