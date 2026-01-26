package utils;

import java.util.Scanner;

/**
 * Utility class to handle input validation.
 */
public class Validation {
    private static final Scanner sc = new Scanner(System.in);

    /**
     * Gets an integer input within a specified range.
     * 
     * @param msg Message to prompt user
     * @param min Minimum valid value
     * @param max Maximum valid value
     * @return Valid integer input
     */
    public static int getInt(String msg, int min, int max) {
        // Loop until valid input
        while (true) {
            try {
                System.out.print(msg);
                int n = Integer.parseInt(sc.nextLine());
                // Check range
                if (n >= min && n <= max) {
                    return n;
                }
                System.err.println(String.format("Range: [%d, %d]", min, max));
            } catch (Exception e) {
                System.err.println("Invalid number!");
            }
        }
    }

    /**
     * Gets a non-empty string input.
     * 
     * @param msg Message to prompt user
     * @return Valid string input
     */
    public static String getString(String msg) {
        // Loop until non-empty input
        while (true) {
            System.out.print(msg);
            String s = sc.nextLine().trim();
            // Check if empty
            if (!s.isEmpty()) {
                return s;
            }
            System.err.println("Cannot be empty!");
        }
    }

    /**
     * Gets a float input.
     * 
     * @param msg Message to prompt user
     * @return Valid float input
     */
    public static float getFloat(String msg) {
        // Loop until valid float
        while (true) {
            try {
                System.out.print(msg);
                return Float.parseFloat(sc.nextLine());
            } catch (Exception e) {
                System.err.println("Invalid area!");
            }
        }
    }
}
