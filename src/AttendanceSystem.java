// Basilio, Andrei Kyle I.
// 2nd year BSIT majoring in Web Technology.
// 10-05-26
// Project no.6
// A simple attendance checker using scanner, switch-case, and most importantly, a loop.

import java.util.Scanner;

public class AttendanceSystem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int isPresent = 0; // Variables that stores incremental values.
        int isAbsent = 0;
        int count = 0; // A variable used to store the incremental values to meet the condition.

        System.out.print("Enter the total number of students in the class: "); // Asks the user to enter the students present.
        int noStudents = scanner.nextInt();

        while (count < noStudents) { // A loop that repeats the process as long as the condition is true.
             count++; // Increments the value for every loop.
            System.out.printf("Is student %d present? (Y/N): ",count);
            char answers = scanner.next().charAt(0);

            switch (answers) { // Check the users given input if it meets any of these cases.
                case 'Y':
                    isPresent++; // Increments a value for every present.
                    break;
                case 'N':
                    isAbsent++; // Increments a value for every absent.
                    break;
                default:
                    System.out.println("Invalid answer.\n");
                    count--; // Decrements when the user enters a wrong input.
            }
        }
        System.out.printf("\nThe total number of students present: %d\n", isPresent); // Prints the program output.
        System.out.printf("The total number of students absent: %d\n", isAbsent);
        System.out.println("\nThank you for your attendance!");
    }
}
