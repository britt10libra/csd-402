/*
 * Name: Brittany Smith
 * Course: CSD-402 Java for Programmers
 * Assignment: Module 3.2 Programming Assignment
 * Description: This program uses nested for loops
 * to display a pyramid of powers of two.
 * Each row ends with the @ symbol.
 */

public class SmithPyramid {

    public static void main(String[] args) {

        // Loop through the seven rows
        for (int row = 0; row < 7; row++) {

            // Print spaces to center the pyramid
            for (int space = 0; space < 6 - row; space++) {
                System.out.print("    ");
            }

            // Print increasing powers of two
            int number = 1;

            for (int col = 0; col <= row; col++) {
                System.out.printf("%4d", number);
                number *= 2;
            }

            // Print decreasing powers of two
            number /= 4;

            for (int col = row - 1; col >= 0; col--) {
                System.out.printf("%4d", number);
                number /= 2;
            }

            // Print spaces and the @ symbol
            for (int space = 0; space < 6 - row; space++) {
                System.out.print("    ");
            }

            System.out.println("   @");
        }
    }
}