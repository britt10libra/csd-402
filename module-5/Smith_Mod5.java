import java.util.Arrays;

public class Smith_Mod5 {

    // Find the largest value in a double array.
    public static int[] locateLargest(double[][] arrayParam) {
        validate(arrayParam);

        int row = 0;
        int col = 0;
        double largest = arrayParam[0][0];

        for (int i = 0; i < arrayParam.length; i++) {
            for (int j = 0; j < arrayParam[i].length; j++) {
                if (arrayParam[i][j] > largest) {
                    largest = arrayParam[i][j];
                    row = i;
                    col = j;
                }
            }
        }
        return new int[]{row, col};
    }

    // Find the largest value in an integer array.
    public static int[] locateLargest(int[][] arrayParam) {
        validate(arrayParam);

        int row = 0;
        int col = 0;
        int largest = arrayParam[0][0];

        for (int i = 0; i < arrayParam.length; i++) {
            for (int j = 0; j < arrayParam[i].length; j++) {
                if (arrayParam[i][j] > largest) {
                    largest = arrayParam[i][j];
                    row = i;
                    col = j;
                }
            }
        }
        return new int[]{row, col};
    }

    // Find the smallest value in a double array.
    public static int[] locateSmallest(double[][] arrayParam) {
        validate(arrayParam);

        int row = 0;
        int col = 0;
        double smallest = arrayParam[0][0];

        for (int i = 0; i < arrayParam.length; i++) {
            for (int j = 0; j < arrayParam[i].length; j++) {
                if (arrayParam[i][j] < smallest) {
                    smallest = arrayParam[i][j];
                    row = i;
                    col = j;
                }
            }
        }
        return new int[]{row, col};
    }

    // Find the smallest value in an integer array.
    public static int[] locateSmallest(int[][] arrayParam) {
        validate(arrayParam);

        int row = 0;
        int col = 0;
        int smallest = arrayParam[0][0];

        for (int i = 0; i < arrayParam.length; i++) {
            for (int j = 0; j < arrayParam[i].length; j++) {
                if (arrayParam[i][j] < smallest) {
                    smallest = arrayParam[i][j];
                    row = i;
                    col = j;
                }
            }
        }
        return new int[]{row, col};
    }

    // Check that an array has valid rows and values.
    private static void validate(int[][] array) {
        if (array == null || array.length == 0 ||
            array[0] == null || array[0].length == 0) {
            throw new IllegalArgumentException("Array cannot be empty.");
        }

        for (int[] row : array) {
            if (row == null || row.length == 0) {
                throw new IllegalArgumentException("Invalid array row.");
            }
        }
    }

    private static void validate(double[][] array) {
        if (array == null || array.length == 0 ||
            array[0] == null || array[0].length == 0) {
            throw new IllegalArgumentException("Array cannot be empty.");
        }

        for (double[] row : array) {
            if (row == null || row.length == 0) {
                throw new IllegalArgumentException("Invalid array row.");
            }
        }
    }

    public static void main(String[] args) {
        int[][] integers = {
            {4, 7, 2},
            {9, 3, 5},
            {1, 6, 8}
        };

        double[][] decimals = {
            {2.5, 7.1, 4.3},
            {9.8, 1.2, 6.4},
            {3.7, 5.6, 8.9}
        };

        try {
            System.out.println("Integer Array:");
            System.out.println("Largest: " +
                Arrays.toString(locateLargest(integers)));
            System.out.println("Smallest: " +
                Arrays.toString(locateSmallest(integers)));

            System.out.println("\nDouble Array:");
            System.out.println("Largest: " +
                Arrays.toString(locateLargest(decimals)));
            System.out.println("Smallest: " +
                Arrays.toString(locateSmallest(decimals)));

        } catch (IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}