package chapter2;

import java.util.Scanner;

public class ComputeChange {

    public static void main(String[] args) {

        // Create a Scanner
        Scanner input = new Scanner(System.in);

        // Receive the amount
        System.out.print("Enter an amount in double, for example 11.56: ");
        double amount = input.nextDouble();

        // Multiply by 100 to convert the amount to cents and
        // remove floating point then cast the result to int
        int amaountInCents = (int) (amount * 100);

        // Find the number of one dollars
        int numberOfOneDollars = amaountInCents / 100;

        // Find the reminder from previous step
        amaountInCents = amaountInCents % 100;
        // Find the number of quarters in the remaining amount
        int numberOfQuarters = amaountInCents / 25;

        // Find the reminder from previous step
        amaountInCents = amaountInCents % 25;
        // Find the number of dimes in the remaining amount
        int numberOfDimes = amaountInCents / 10;

        // Find the reminder from previous step
        amaountInCents = amaountInCents % 10;
        // Find the number of nickels in the remaining amount
        int numberOfNickels = amaountInCents / 5;

        // Find the reminder from previous step
        amaountInCents = amaountInCents % 5;
        // Find the number of pennies in the remaining amount
        int numberOfPennies = amaountInCents;

        // Display results
        System.out.println("Your amount " + amount + " consists of");
        System.out.println("    " + numberOfOneDollars + " dollars");
        System.out.println("    " + numberOfQuarters + " quarters ");
        System.out.println("    " + numberOfDimes + " dimes");
        System.out.println("    " + numberOfNickels + " nickels");
        System.out.println("    " + numberOfPennies + " pennies");
    }
}