// Basilio, Andrei Kyle I.
// 2nd year BSIT majoring in Web Technology
// 10-04-26
// Project no.4
// A simple grocery discount calculator using the if-else statement, logical operators, relational operators, and scanner.

import java.util.Scanner;

public class GroceryDiscountCalc {
    public static void main (String [] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome to the Grocery Discount Calculator!");
        System.out.print("Please enter your grocery amount: "); // Asks the user to enter the grocery amount.
        double groceryAmount = scanner.nextDouble();

        if (groceryAmount < 1000) { // It evaluates if the conditional price is met.
            System.out.println("You have NO discount.");
            System.out.printf("Final total after discount: PHP %.2f\n", groceryAmount);
        } else if (groceryAmount >= 1000 && groceryAmount <= 5000) { // Alternative conditions if it doesn't meet the if condition like the grocery price is higher.
            System.out.println("You have 5% discount.");
            double discount5 = groceryAmount * 0.05; // Formula for specific discounts.
            double finalTotal1 = groceryAmount - discount5;
            System.out.printf("Final total after discount: PHP %.2f\n", finalTotal1); // Print the final price output.
        } else if (groceryAmount > 5000 && groceryAmount <= 10000) {
            System.out.println("You have 10% discount.");
            double discount10 = groceryAmount * 0.10;
            double finalTotal2 = groceryAmount - discount10;
            System.out.printf("Final total after discount: PHP %.2f\n", finalTotal2);
        } else {
            System.out.println("You have 20% discount.");
            double discount20 = groceryAmount * 0.20;
            double finalTotal3 = groceryAmount - discount20;
            System.out.printf("Final total after discount: PHP %.2f\n", finalTotal3);
        }
        System.out.println("\nEnjoy your discount!");
    }
}
