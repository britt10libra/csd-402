/**
 * Module 7.2 Programming Assignment
 * CSD-402 Java for Programmers
 *
 * This program creates a collection of Fan objects
 * and displays their settings without using the
 * toString() method. It also tests error handling
 * for invalid fan settings and empty or null inputs.
 */

import java.util.ArrayList;

public class UseFans {

    // Display information for a single fan
    public static void displayFan(Fan fan) {
        if (fan == null) {
            System.out.println("No fan to display.");
            return;
        }

        System.out.println("Fan speed: " + fan.getSpeed());
        System.out.println("Fan on: " + fan.isOn());
        System.out.println("Fan radius: " + fan.getRadius());
        System.out.println("Fan color: " + fan.getColor());
    }

    // Display information for a collection of fans
    public static void displayFans(ArrayList<Fan> fans) {
        if (fans == null || fans.isEmpty()) {
            System.out.println("No fans to display.");
            return;
        }

        for (int i = 0; i < fans.size(); i++) {
            System.out.println("\nFan " + (i + 1) + ":");
            displayFan(fans.get(i));
        }
    }

    // Test the Fan class and display methods
    public static void main(String[] args) {

        ArrayList<Fan> fans = new ArrayList<>();

        // Create several fan objects
        fans.add(new Fan());
        fans.add(new Fan(Fan.FAST, true, 10.0, "Blue"));
        fans.add(new Fan(Fan.MEDIUM, false, 8.0, "White"));
        fans.add(new Fan(Fan.SLOW, true, 12.0, "Black"));

        // Display the collection
        System.out.println("Fan Collection:");
        displayFans(fans);

        // Display a single fan
        System.out.println("\nSingle Fan:");
        displayFan(fans.get(1));

        // Test invalid fan settings
        System.out.println("\nTesting Error Handling:");

        try {
            Fan invalidFan = new Fan(5, true, 10.0, "Red");
            displayFan(invalidFan);
        } catch (IllegalArgumentException e) {
            System.out.println("Invalid speed handled: "
                    + e.getMessage());
        }
         // Test an invalid radius
        try {
            Fan invalidFan = new Fan(Fan.SLOW, true, -2.0, "Green");
            displayFan(invalidFan);
        } catch (IllegalArgumentException e) {
            System.out.println("Invalid radius handled: "
                    + e.getMessage());
        }

        // Test an invalid color
        try {
            Fan invalidFan = new Fan(Fan.MEDIUM, true, 8.0, "");
            displayFan(invalidFan);
        } catch (IllegalArgumentException e) {
            System.out.println("Invalid color handled: "
                    + e.getMessage());
        }
        // Test an empty collection
        System.out.println("\nTesting Empty Collection:");
        displayFans(new ArrayList<Fan>());

        // Test a null fan
        System.out.println("\nTesting Null Fan:");
        displayFan(null);
    }
}
