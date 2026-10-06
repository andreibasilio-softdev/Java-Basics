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
        while (loop) {
            boolean hasLowerCase = false;
            boolean hasUpperCase = false;
            boolean hasDigit = false;
            boolean hasSpecialLetter = false;
            boolean questionLoop = true;

            System.out.print("Please enter your password: ");
            String password = scanner.nextLine();

            for (int i = 0; i < password.length(); i++) {
                if (Character.isLowerCase(password.charAt(i))) {
                    hasLowerCase = true;
                } else if (Character.isUpperCase(password.charAt(i))) {
                    hasUpperCase = true;
                } else if (Character.isDigit(password.charAt(i))) {
                    hasDigit = true;
                } else if (!Character.isDigit(password.charAt(i))) {
                    hasSpecialLetter = true;
                }
        }
            if (hasLowerCase && hasUpperCase && hasDigit && hasSpecialLetter && password.length() >= 8) {
                System.out.println("Your password is valid!\n");
            } else {
                System.out.println("Your password is invalid!\n");
                continue;
            }

            while(questionLoop) {
                System.out.print("Do you still want to continue Y/N?: ");
                char choice = scanner.next().charAt(0);

                scanner.nextLine();

                if (choice == 'Y') {
                    questionLoop = false;
                } else if (choice == 'N') {
                    loop = false;
                    questionLoop = false;
                } else {
                    System.out.println("Invalid choice!\n");
                }
            }
        }
        System.out.println("\nThank you for using our password validation system!");
    }
}
