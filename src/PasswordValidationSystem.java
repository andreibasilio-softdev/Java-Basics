// Basilio, Andrei Kyle I.
// 2nd year BSIT majoring in Web Technology.
// 10-06-26
// Project no.7
// A simple password checker using scanner, if else, loop, and character class.

import java.util.Scanner;

public class PasswordValidationSystem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean loop = true;

        while (loop) { // A loop that will repeat the process based on the users' preference.
            boolean hasLowerCase = false; // Boolean variable flags to check each digit of the given password.
            boolean hasUpperCase = false;
            boolean hasDigit = false;
            boolean hasSpecialLetter = false;
            boolean questionLoop = true; // A variable that runs the loop until it becomes false.

            System.out.print("Please enter your password: "); // Asks the user for the password.
            String password = scanner.nextLine();

            for (int i = 0; i < password.length(); i++) { // A loop that will traverse each digit in the given password.
                if (Character.isLowerCase(password.charAt(i))) { // Statements for checking the characters in the password.
                    hasLowerCase = true;
                } else if (Character.isUpperCase(password.charAt(i))) {
                    hasUpperCase = true;
                } else if (Character.isDigit(password.charAt(i))) {
                    hasDigit = true;
                } else if (!Character.isDigit(password.charAt(i))) {
                    hasSpecialLetter = true;
                }
        }
            if (hasLowerCase && hasUpperCase && hasDigit && hasSpecialLetter && password.length() >= 8) { // If the user meets the password, it's valid, else invalid.
                System.out.println("Your password is valid!\n");
            } else {
                System.out.println("Your password is invalid!\n");
                continue;
            }

            while(questionLoop) { // A loop for repeating the question if the user input is invalid.
                System.out.print("Do you still want to continue Y/N?: ");
                char choice = scanner.next().charAt(0);

                scanner.nextLine();
                System.out.println();

                if (choice == 'Y') { // It runs the whole process again.
                    questionLoop = false;
                } else if (choice == 'N') { // Stops the loop and exits the program.
                    loop = false;
                    questionLoop = false;
                } else {
                    System.out.println("Invalid choice!\n");
                }
            }
        }
        System.out.println("Thank you for using our password validation system!");
    }
}
