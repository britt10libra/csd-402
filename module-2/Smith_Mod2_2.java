/*
 * Name: Brittany Smith
 * Assignment: CSD 402 Module 2.2
 * Description: Rock-Paper-Scissors Game
 */

import java.util.Scanner;
import java.util.Random;

public class Smith_Mod2_2 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        Random random = new Random();

        // Generate a random computer selection
        int computerChoice = random.nextInt(3) + 1;

        // Display game instructions
        System.out.println("Welcome to Rock-Paper-Scissors!");
        System.out.println("1 = Rock");
        System.out.println("2 = Paper");
        System.out.println("3 = Scissors");

        // Get the user's selection
        System.out.print("Enter your choice (1, 2, or 3): ");
        int userChoice = input.nextInt();

        // Check for valid input
        if (userChoice < 1 || userChoice > 3) {
            System.out.println("Invalid selection. Please enter 1, 2, or 3.");
        } else {

            String[] choices = {"", "Rock", "Paper", "Scissors"};

            // Display both selections
            System.out.println("\nComputer selected: " + choices[computerChoice]);
            System.out.println("You selected: " + choices[userChoice]);

            // Determine the winner
            if (userChoice == computerChoice) {
                System.out.println("Result: It's a tie!");
            } else if (
                (userChoice == 1 && computerChoice == 3) ||
                (userChoice == 2 && computerChoice == 1) ||
                (userChoice == 3 && computerChoice == 2)
            ) {
                System.out.println("Result: You win!");
            } else {
                System.out.println("Result: Computer wins!");
            }
        }

        input.close();
    }
}