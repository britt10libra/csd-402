/**
 * Module 6.2 Programming Assignment
 * CSD-402 Java for Programmers
 *
 * This class represents a fan with adjustable
 * speed, radius, color, and power settings.
 */
public class Fan {

    // Constants for the fan speeds
    public static final int STOPPED = 0;
    public static final int SLOW = 1;
    public static final int MEDIUM = 2;
    public static final int FAST = 3;

    // Fan properties and default values
    private int speed = STOPPED;
    private boolean on = false;
    private double radius = 6;
    private String color = "white";

    // Default constructor
    public Fan() {
    }

    // Constructor with arguments
    public Fan(int speed, boolean on,
               double radius, String color) {
        this.setSpeed(speed);
        this.setOn(on);
        this.setRadius(radius);
        this.setColor(color);
    }

    // Getter and setter for speed
    public int getSpeed() {
        return this.speed;
    }

    public void setSpeed(int speed) {
        if (speed < STOPPED || speed > FAST) {
            throw new IllegalArgumentException(
                "Speed must be between 0 and 3.");
        }
        this.speed = speed;
    }

    // Getter and setter for power
    public boolean isOn() {
        return this.on;
    }

    public void setOn(boolean on) {
        this.on = on;
    }

    // Getter and setter for radius
    public double getRadius() {
        return this.radius;
    }

    public void setRadius(double radius) {
        if (!Double.isFinite(radius) || radius <= 0) {
    throw new IllegalArgumentException(
        "Radius must be a finite number greater than zero.");
}

        this.radius = radius;
    }

    // Getter and setter for color
    public String getColor() {
        return this.color;
    }

    public void setColor(String color) {
        if (color == null || color.trim().isEmpty()) {
            throw new IllegalArgumentException(
                "Color cannot be empty.");
        }
        this.color = color;
    }

    // Return a description of the fan
    @Override
    public String toString() {
        return "Fan speed: " + this.speed
            + "\nFan on: " + this.on
            + "\nFan radius: " + this.radius
            + "\nFan color: " + this.color;
    }
}