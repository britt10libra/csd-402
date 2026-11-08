/*
 * Name: Brittany Smith
 * Date: 11/07/2026
 * Assignment: CSD 402 Module 4.2
 * Description: Demonstrates method overloading
 * and error handling when calculating array averages.
 */

import java.util.Arrays;

public class Smith_Mod4_2 {

    // Validate that an array contains elements
    public static void validateArray(int length) {
        if (length == 0) {
            throw new IllegalArgumentException(
                "Array cannot be empty."
            );
        }
    }

    // Calculate average of a short array
    public static short average(short[] array) {
        if (array == null) {
            throw new IllegalArgumentException(
                "Short array cannot be null."
            );
        }

        validateArray(array.length);

        long sum = 0;
        for (short number : array) {
            sum += number;
        }

        return (short)(sum / array.length);
    }

    // Calculate average of an int array
    public static int average(int[] array) {
        if (array == null) {
            throw new IllegalArgumentException(
                "Integer array cannot be null."
            );
        }

        validateArray(array.length);

        long sum = 0;
        for (int number : array) {
            sum += number;
        }

        return (int)(sum / array.length);
    }

    // Calculate average of a long array
    public static long average(long[] array) {
        if (array == null) {
            throw new IllegalArgumentException(
                "Long array cannot be null."
            );
        }

        validateArray(array.length);

        // Calculate without overflowing a long sum
        long quotientSum = 0;
        long remainderSum = 0;
        long count = array.length;

        for (long number : array) {
            quotientSum = Math.addExact(
                quotientSum, number / count
            );
            remainderSum = Math.addExact(
                remainderSum, number % count
            );
        }

        return Math.addExact(
            quotientSum, remainderSum / count
        );
    }

    // Calculate average of a double array
    public static double average(double[] array) {
        if (array == null) {
            throw new IllegalArgumentException(
                "Double array cannot be null."
            );
        }

        validateArray(array.length);

        double sum = 0;
        for (double number : array) {
            if (!Double.isFinite(number)) {
                throw new IllegalArgumentException(
                    "Double array contains an invalid number."
                );
            }
            sum += number / array.length;
        }

        if (!Double.isFinite(sum)) {
            throw new ArithmeticException(
                "Double average is outside the valid range."
            );
        }

        return sum;
    }

    public static void main(String[] args) {

        short[] shortArray = {10, 20, 30};
        int[] intArray = {5, 10, 15, 20};
        long[] longArray = {100, 200, 300, 400, 500};
        double[] doubleArray =
            {2.5, 4.5, 6.5, 8.5, 10.5, 12.5};

        System.out.println(
            "CSD 402 Module 4.2 - Array Averages"
        );
        System.out.println("----------------------------------");

        try {
            System.out.println("Short Array: "
                + Arrays.toString(shortArray));
            System.out.println("Average: "
                + average(shortArray));

            System.out.println();

            System.out.println("Integer Array: "
                + Arrays.toString(intArray));
            System.out.println("Average: "
                + average(intArray));

            System.out.println();

            System.out.println("Long Array: "
                + Arrays.toString(longArray));
            System.out.println("Average: "
                + average(longArray));

            System.out.println();

            System.out.println("Double Array: "
                + Arrays.toString(doubleArray));
            System.out.println("Average: "
                + average(doubleArray));

        } catch (IllegalArgumentException
                 | ArithmeticException e) {
            System.err.println(
                "Calculation error: " + e.getMessage()
            );
        }

        // Test error handling with an empty array
        System.out.println();
        System.out.println("Error Handling Test:");

        try {
            int[] emptyArray = {};
            System.out.println(
                "Average: " + average(emptyArray)
            );
        } catch (IllegalArgumentException e) {
            System.out.println(
                "Error caught: " + e.getMessage()
            );
        }
    }
}