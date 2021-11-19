package chapter5;

import java.util.Scanner;

public class SentinelValue {

    public static void main(String[] args) {
        // 1- Read an initial data
        System.out.print("Enter an int value (the program exits if the input is 0): ");
        Scanner input = new Scanner(System.in);
        int data = input.nextInt();

        // 2- Keep reading data until the input is 0
        int sum = 0;
        while (data != 0) {
            sum += data;
            // 3- Read the next data
            System.out.print("Enter an int value (the program exits if the input is 0): ");
            data = input.nextInt();
        }

        System.out.println("The sum is " + sum);
    }
}
