// Basilio, Andrei Kyle I.
// 2nd year BSIT majoring in Web Technology.
// 10-04-26
// Console based Area & Perimeter rectangle calculator using the variables and basic arithmetic operations.

public class AreaPerimeterRec {
    public static void main(String[] args) {
        System.out.println("\nYou are tasked with helping a construction company estimate the materials needed to build a rectangular garden. \nThe company needs to know the area and perimeter of the garden based on its ficed dimensions.");

        int length = 36; // Variables that stores values.
        int width = 52;
        int area = length * width; // Formula for area.
        int perimeter = 2 * (length + width); // Formula for perimeter.

        System.out.printf("\nThe length of the garden is %d\n", length); //Printing the outputs of the program.
        System.out.printf("The width of the garden is %d\n",width);
        System.out.printf("The area of the garden is %d\n",area);
        System.out.printf("The perimeter of the garden is %d\n", perimeter);
    }
}
