// Program to check whether a year is a Leap Year or not

import java.util.Scanner;

class LeapYearChecker {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // Take year input
        System.out.print("Enter a year: ");
        int year = input.nextInt();

        // Check Gregorian calendar condition
        if (year < 1582) {
            System.out.println("Leap Year calculation valid only for year >= 1582.");
        } 
        else {

            boolean isLeap = false;

            // Leap year logic
            if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
                isLeap = true;
            }

            if (isLeap) {
                System.out.println("The year " + year + " is a Leap Year.");
            } else {
                System.out.println("The year " + year + " is NOT a Leap Year.");
            }
        }

        input.close();
    }
}