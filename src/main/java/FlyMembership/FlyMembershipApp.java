package FlyMembership;

import java.util.Scanner;

public class FlyMembershipApp {
    public static void main(String[] args) {

        // Declare variables
        int status;
        String europe;

        // Lets declare an Object variable of Type FlyMembership using the default
        // constructor
        FlyMembership person1 = new FlyMembership();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome to Fly Club!");

        while (true) {
            // Lets catch bad inputs (not int)
            try {
                System.out.println("Please enter your membership status: ");
                System.out.println("1 - Green");
                System.out.println("2 - Gold");
                System.out.println("3 - Platinum");

                // -----------the input -----------
                status = scanner.nextInt();
                if (status >= 1 && status <= 3) {

                    // Set the status variable in the Flymembership Obj
                    person1.setStatus(status);
                    // lets pass the membership status value to our FlyMembership Obj
                    System.out.println("Is your flight within Europe?");
                    System.out.println("Yes or No");

                    // -----------the input -----------
                    europe = scanner.next();
                    europe = europe.toLowerCase();

                    // validates input is "yes" or "y"
                    if (europe.equals("yes") || europe.equals("y")) {
                        // ----------------The processing--------------
                        person1.setEuropeTravel(true);
                        person1.calculateRewards();
                        // validates input is "no" or "n"
                    } else if (europe.equals("no") || europe.equals("n")) {
                        // ----------------The processing--------------
                        person1.calculateRewards();
                    } else {
                        // error is input other than yes or no is given
                        System.out.println("Invalid yes or no input, Restart the app and try again.");
                    }
                    // -------------------Output-------------------
                    System.out.println("Reward Points: " + person1.getPoints());
                    System.out.println("Piroirty Boarding: " + person1.getPirorityBoarding());
                    break;
                }
            } catch (Exception e) {
                System.out.println(
                        "Invalid Input the choices are between 1, 2 and 3. Please restart the app and try again.");
                break;
            }
        }
        // Close the Scanner Obj, so no memory leaks
        scanner.close();
    }
}
