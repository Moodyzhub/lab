package utils;

import java.util.Scanner;

public class Validation {
    private static final Scanner sc = new Scanner(System.in);

    public static int getInt(String msg, int min, int max) {
        while (true) {
            try {
                System.out.print(msg);
                int n = Integer.parseInt(sc.nextLine());
                if (n >= min && n <= max) return n;
                System.err.println("Range: [" + min + ", " + max + "]");
            } catch (Exception e) { System.err.println("Invalid number!"); }
        }
    }

    public static String getString(String msg) {
        while (true) {
            System.out.print(msg);
            String s = sc.nextLine().trim();
            if (!s.isEmpty()) return s;
            System.err.println("Cannot be empty!");
        }
    }

    public static float getFloat(String msg) {
        while (true) {
            try {
                System.out.print(msg);
                return Float.parseFloat(sc.nextLine());
            } catch (Exception e) { System.err.println("Invalid area!"); }
        }
    }
}
