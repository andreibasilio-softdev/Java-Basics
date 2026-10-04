// Basilio, Andrei Kyle I.
// 2nd year BSIT majoring in Web Technology.
// 10-04-26
// Project no.5
// A simple restaurant order program using switch case statement and scanner.

import java.util.Scanner;

public class RestOrderSystem {
    public static void main (String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome to the Rest Order System!\n");
        System.out.println("\t\t\tMENU"); // Menu of choices.
        System.out.println("1.Burger\t\t\t- PHP 80");
        System.out.println("2.Fries\t\t\t\t- PHP 50");
        System.out.println("3.Soda\t\t\t\t- PHP 35");
        System.out.println("4.Ice Cream\t\t\t- PHP 40");
        System.out.println("5.EXIT");

        System.out.print("Please enter your choice: "); // Asks the user for the order choice.
        int choice = scanner.nextInt();

        switch(choice) { // Check each case based on the orders choice.
            case 1:
                System.out.println("\nYou choose Burger!");
                System.out.print("Please enter the quantity: "); // Asks the user to enter the quantity of the order.
                int quantity1 = scanner.nextInt();
                double price1 = 80 * quantity1; // Formula for calculating the total amount.
                System.out.printf("Total price: %.2f%n", price1); // Print the final total.
                break; // Used to prevent executing the next case after this case.
             case 2:
                 System.out.println("\nYou choose Fries!");
                 System.out.print("Please enter the quantity: ");
                 int quantity2 = scanner.nextInt();
                 double price2 = 50 * quantity2;
                 System.out.printf("Total price: %.2f%n", price2);
                 break;
             case 3:
                 System.out.println("\nYou choose Soda!");
                 System.out.print("Please enter the quantity: ");
                 int quantity3 = scanner.nextInt();
                 double price3 = 35 * quantity3;
                 System.out.printf("Total price: %.2f%n", price3);
                 break;
             case 4:
                 System.out.println("\nYou choose Ice Cream!");
                 System.out.print("Please enter the quantity: ");
                 int quantity4 = scanner.nextInt();
                 double price4 = 40 * quantity4;
                 System.out.printf("Total price: %.2f%n", price4);
                 break;
             case 5:
                 System.out.println("Thank you for visiting!");
                 System.exit(0); // Used to exit the program immediately after the user choose 5.
                 break;
            default: // Used if the user enters a wrong choice.
                System.out.println("Invalid choice!");
                System.exit(0);
                break;
        }
        System.out.println("\nThank you for ordering. Enjoy your order!"); // Thank you message.
    }
}
