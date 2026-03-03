// Program to check whether a number is Armstrong or not

import java.util.Scanner;

class ArmstrongNumber {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = input.nextInt();

        int originalNumber = number;
        int sum = 0;

        // Extract digits
        while (originalNumber != 0) {

            int digit = originalNumber % 10;

            sum = sum + (digit * digit * digit);

            originalNumber = originalNumber / 10;
        }

        if (sum == number) {
            System.out.println("The number " + number + " is an Armstrong Number.");
        } else {
            System.out.println("The number " + number + " is NOT an Armstrong Number.");
        }

        input.close();
    }
}