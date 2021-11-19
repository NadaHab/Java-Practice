package chapter5;

import java.util.Scanner;

public class GuessNumberOneTime {

    public static void main(String[] args) {
        // 1- Generate a random number to be guessed
        int number = (int) (Math.random() * 101);

        // 2- Prompt the user to guess the number
        System.out.println("Guess a magic number between 0 and 100");
        System.out.print("\nEnter your guess: ");

        Scanner input = new Scanner(System.in);
        int guess = input.nextInt();

        // 3- Evaluate user answer
        if (guess == number)
            System.out.println("Yes, the number is " + number);
        else if (guess > number)
            System.out.println("Your guess is too high");
        else
            System.out.println("Your guess is too low");
    }
}
