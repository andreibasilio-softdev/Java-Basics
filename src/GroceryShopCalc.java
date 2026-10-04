// Basilio, Andrei Kyle I.
// 2nd year BSIT majoring in Web Technology
// 10-04-26
// Project no.3
// A simple grocery shopping calculator using the scanner for user inputs and basic arithmetic operations.

import java.util.Scanner; // Import the scanner class.

public class GroceryShopCalc {
    public static void main (String [] args) {
        Scanner scanner = new Scanner(System.in); //Initiating a scanner object.
        System.out.println("Welcome to the Grocery Shop Calculator!");
        System.out.print("Please enter the price of Item 1: "); // It asks the users for item price.
        double price1 = scanner.nextDouble();
        System.out.print("Please enter the quantity of Item 1: "); // It asks the users for the quantity/number of items.
        double qty1 = scanner.nextDouble();
        System.out.println();
        System.out.print("Please enter the price of Item 2: ");
        double price2 = scanner.nextDouble();
        System.out.print("Please enter the quantity of Item 2: ");
        double qty2 = scanner.nextDouble();
        System.out.println();
        System.out.print("Please enter the price of Item 3: ");
        double price3 = scanner.nextDouble();
        System.out.print("Please enter the quantity of Item 3: ");
        double qty3 = scanner.nextDouble();
        System.out.println();

        double subtotal = (price1 * qty1) + (price2 * qty2) + (price3 * qty3); // Formula for subtotal.
        double discount = subtotal * 0.05; // Formula for the discount.
        double salesTax = (subtotal - discount) * 0.12; // Formula for the sales tax.
        double finalTotal = (subtotal -discount) + salesTax; //Formula for the final total.

        System.out.printf("The subtotal of the grocery is PHP %.2f\n", subtotal); // Prints the result of the program.5
        System.out.printf("The discount of the grocery is PHP %.2f\n", discount);
        System.out.printf("The sales tax of the grocery is PHP %.2f\n", salesTax);
        System.out.printf("The final total of the grocery is PHP %.2f\n\n", finalTotal);
        System.out.println("Thank you for your shopping!");
    }
}
