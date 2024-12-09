package utils;

import java.util.Scanner;

public class Validation {
    private static Scanner scanner = new Scanner(System.in);

    public static int getInt(String message) {
        while (true) {
            System.out.print(message);
            try {
                return Integer.parseInt(scanner.nextLine());
            } catch (NumberFormatException e) {
                System.out.println("Invalid input. Please enter an integer.");
            }
        }
    }

    public static double getDouble(String message) {
        while (true) {
            System.out.print(message);
            try {
                return Double.parseDouble(scanner.nextLine());
            } catch (NumberFormatException e) {
                System.out.println("Invalid input. Please enter a number.");
            }
        }
    }

    public static String getString(String message) {
        System.out.print(message);
        return scanner.nextLine().trim();
    }
}
