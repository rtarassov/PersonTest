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


        // TODO: make loop work like: - ask name - enter name, ask age - enter age
        // TODO: not like: - ask name, age ... - enter name, age ...
        // Makes user fill the array with name, age and hair color.
        for (int i = 0; i < students.length; i++) {
            scanner.nextLine(); // Doesn't work without this line, no idea why.
            /** Exception in thread "main" java.util.InputMismatchException **/

            // So user would be displayed Student 1 instead of Student 0
            int actualStudent = i + 1;

            System.out.println("Enter student " + actualStudent + "\n name \n age \n hair color");
            students[i] = new Student(scanner.nextLine(), scanner.nextInt(), scanner.next());

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
