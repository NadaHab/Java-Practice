package chapter2;

import java.util.Scanner;

public class DisplayTime {

    public static void main(String[] args) {

        // Prompt the user for input
        System.out.print("Enter an integer for seconds: ");

        Scanner input = new Scanner(System.in);
        int seconds = input.nextInt();

        int minutes = seconds / 60; // Find minutes in seconds
        int remainingSeconds = seconds % 60; // Seconds remaining
        System.out.println(seconds + " seconds is " + minutes +
                " minutes and " + remainingSeconds + " seconds");
    }
}
