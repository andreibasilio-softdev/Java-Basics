// Basilio, Andrei Kyle I.
// 2nd year BSIT majoring in Web Technology
// 10-02-26
//Project no.1
// A simple console invoice program using the \n, \", \t, print, and println for formatting and printing the program outputs.

public class ConsoleInvoice {
    public static void main (String [] args) {
        System.out.println("\"Andrei's Sari-Sari Store\""); // Putting a quotation using \".
        System.out.println("No. 94 Purok 12, Brgy Los Banos, Baguio City. Philippines, 2600.\n"); // Breaking to the next line using \n.
        System.out.println("\tItem:\t\t\t\t\t\tQuantity:\t\t\tPrice:\n"); // Formatting the output using \t like tabs.
        System.out.println("1.Gardenia Whole Wheat Bread\t\t2x\t\t\t\tPHP 220");
        System.out.println("2.1 Tray of Eggs.\t\t\t\t\t2x\t\t\t\tPHP 360");
        System.out.println("3.Nutella Chocolate\t\t\t\t\t3x\t\t\t\tPHP 330");
        System.out.println("4.SPAM Luncheon Meat\t\t\t\t2x\t\t\t\tPHP 250");
        System.out.println("5.Tender Juicy Hotdog\t\t\t\t2x\t\t\t\tPHP 360");
        System.out.println("6.1 Pack of Whoppie chocolate\t\t3x\t\t\t\tPHP 360");
        System.out.println("7.1 whole yellow pad paper\t\t\t1x\t\t\t\tPHP 90");
        System.out.println("8.1 whole Magnolia Chicken\t\t\t2x\t\t\t\tPHP 600");
        System.out.println("9.4 packs Head & Shoulder shampoo\t2x\t\t\t\tPHP 64");
        System.out.println("10.1.5L Coca-Cola no sugar\t\t\t2x\t\t\t\tPHP 180");
        System.out.print("\nTOTAL:\t\t\t\t\t\t\t\t\t\t\t\t"); // Using print instead of the println to place the output below on the same line.
        System.out.println("PHP 2814\n"); // Total output.
        System.out.println("\t\t\t\t\tThank you for buying!");
    }
}
