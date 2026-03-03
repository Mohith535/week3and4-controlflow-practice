// Program to print odd and even numbers till user input

import java.util.Scanner;

class OddEvenPrinter {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter a natural number: ");
        int number = input.nextInt();

        if (number > 0) {

            for (int i = 1; i <= number; i++) {

                if (i % 2 == 0) {
                    System.out.println(i + " is Even");
                } else {
                    System.out.println(i + " is Odd");
                }
            }

        } else {
            System.out.println("Not a natural number.");
        }

        input.close();
    }
}