package chapter5;

import java.util.Scanner;

public class Palindrome {

    public static void main(String[] args) {
        // Create a Scanner
        Scanner input = new Scanner(System.in);

        // Prompt the user to enter a string
        System.out.print("Enter a string: ");
        String myString = input.nextLine();

        // The index of the first character in the string
        int low = 0;

        // The index of the last character in the string
        int high = myString.length() - 1;

        boolean isPalindrome = true;


        while (low < high) { //----------------------------------------

            if (myString.charAt(low) != myString.charAt(high)) {
                isPalindrome = false;
                break;
            }
            // Move to the next character from the beginning and end
            low++;
            high--;
        }
        //-------------------------------------------------------------

        if (isPalindrome)
            System.out.println(myString + " is a palindrome");
        else
            System.out.println(myString + " is not a palindrome");
    }
}
