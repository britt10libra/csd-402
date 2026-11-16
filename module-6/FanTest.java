/**
 * Module 6.2 Programming Assignment
 * CSD-402 Java for Programmers
 *
 * Tests the Fan class using both constructors,
 * getters, setters, and error handling.
 */
public class FanTest {

    public static void main(String[] args) {

        // Create a fan using default settings
        Fan fan1 = new Fan();

        System.out.println("Default Fan:");
        System.out.println(fan1);

        // Create a fan using the argument constructor
        Fan fan2 = new Fan(Fan.FAST, true, 10, "blue");

        System.out.println("\nCustom Fan:");
        System.out.println(fan2);

        // Test the setter methods
        fan1.setSpeed(Fan.MEDIUM);
        fan1.setOn(true);
        fan1.setRadius(8);
        fan1.setColor("green");

        System.out.println("\nUpdated Default Fan:");
        System.out.println(fan1);

        // Test the getter methods
        System.out.println("\nTesting Getter Methods:");
        System.out.println("Speed: " + fan1.getSpeed());
        System.out.println("On: " + fan1.isOn());
        System.out.println("Radius: " + fan1.getRadius());
        System.out.println("Color: " + fan1.getColor());

        // Test error handling
        System.out.println("\nTesting Error Handling:");

        try {
            fan1.setSpeed(5);
        } catch (IllegalArgumentException e) {
            System.out.println("Error caught: "
                + e.getMessage());
        }

        try {
            fan1.setRadius(-2);
        } catch (IllegalArgumentException e) {
            System.out.println("Error caught: "
                + e.getMessage());
        }

        try {
            fan1.setColor("");
        } catch (IllegalArgumentException e) {
            System.out.println("Error caught: "
                + e.getMessage());
        }
    }
}
