package code.tektask;

import java.util.Scanner;
import java.util.regex.Pattern;

public class UserInterface {
    public static void main(String[] args) {
        System.out.println("Welcome to Tektask!");
        Scanner scanner = new Scanner(System.in);
        UI_one(scanner);
        //UI_two(scanner);
    }

    private static void UI_one(Scanner scanner) {
        System.out.println("Please enter your name: ");
        String name = scanner.next();
        System.out.println("Enter your PAN Number: ");
        String panNumber = scanner.next();

        String patPan = "^[A-Z]{5}[0-9]{4}[A-Z]$";
        if (Pattern.matches(patPan, panNumber)) {
            System.out.println("Hello " + name + ", your PAN number is valid.");
            System.out.println("Enter your email address: ");
            String email = scanner.next();
            String patEmail = "[a-z]{5,10}[@][a-z]{7}[.][a-z]{3}";

            if (Pattern.matches(patEmail, email) && email.substring(email.length() - 11).equalsIgnoreCase("digitec.com")) {
                System.out.println("Your email address is valid.");
            } else {
                System.out.println("Invalid email address. Please try again.");
            }
        } else {
            System.out.println("Invalid PAN number. Please try again.");
        }
    }

    private static void UI_two(Scanner scanner) {
        System.out.println("Please enter your name: ");
        String name = scanner.next();
        System.out.println("Please enter your ID: ");
        String id = scanner.next();

        if (id.length() != 10) {
            System.out.println("Invalid ID length. Please enter a 10-character ID.");
            return;
        }

        if (!id.startsWith("SPC")) {
            System.out.println("Invalid ID format. ID should start with 'SPC'.");
            return;
        }

        String seat = id.substring(3, 6); // next 3 digits
        String timeStr = id.substring(6, 8); // hour
        String zone = id.substring(8, 10); // "AM" or "PM"

        if (!seat.matches("\\d{3}")) {
            System.out.println("Invalid seat number. Seat should be 3 digits.");
            return;
        }

        int time;
        try {
            time = Integer.parseInt(timeStr);
        } catch (NumberFormatException e) {
            System.out.println("Invalid time format. Please enter a valid hour (1-12).");
            return;
        }

        if (time < 1 || time > 12) {
            System.out.println("Invalid time. Please enter a valid hour (1-12).");
            return;
        }

        if (!zone.equalsIgnoreCase("AM") && !zone.equalsIgnoreCase("PM")) {
            System.out.println("Invalid zone. Please enter 'AM' or 'PM'.");
            return;
        }

        System.out.println("Hi " +name +" your seat number is " +seat + " and the event starts at " +time+ "" +zone + ".");

    }
}