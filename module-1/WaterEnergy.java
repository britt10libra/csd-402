import java.util.Scanner;

/**
 * CSD-402 Module 1.3 Programming Assignment
 * Student: Brittany Smith
 * Date: October 25, 2026
 *
 * This program calculates the amount of energy
 * required to heat water from an initial
 * temperature to a final temperature.
 */
public class WaterEnergy {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // Get water mass in kilograms
        System.out.print("Enter water weight in kilograms: ");
        double waterMass = input.nextDouble();

        // Get initial water temperature
        System.out.print("Enter initial temperature in Celsius: ");
        double initialTemperature = input.nextDouble();

        // Get final water temperature
        System.out.print("Enter final temperature in Celsius: ");
        double finalTemperature = input.nextDouble();

        // Calculate energy in joules
        double energy = waterMass *
                (finalTemperature - initialTemperature) * 4184;

        // Display the calculated energy
        System.out.printf("Energy required: %.2f joules%n", energy);

        input.close();
    }
}