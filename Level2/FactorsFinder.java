// Program to find factors of a number

import java.util.Scanner;

class FactorsFinder {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter a positive number: ");
        int number = input.nextInt();

        if (number > 0) {

            System.out.println("Factors of " + number + " are:");

            for (int i = 1; i <= number; i++) {

                if (number % i == 0) {
                    System.out.println(i);
                }
            }

        } else {
            System.out.println("Not a positive integer.");
        }

        input.close();
    }
}