package chapter7II;

import java.util.Scanner;

public class LottoNumbers {

    public static void main(String args[]) {

        Scanner input = new Scanner(System.in);

        // 1- Create a boolean array as big as the numbers we want to cover
        boolean[] isCovered = new boolean[5]; // default false

        // Read all numbers and mark corresponding element covered
        int number  = 0;

        while (number != -1) {
            System.out.print("\nPlease select -1 to exit.\nPlease enter an Array index start from 0 to 4: ");

            // 2- Use user input number as an index to make that index in isCovered array true
            isCovered[number] = true;
            number = input.nextInt();
        }

        // Check if all covered
        boolean allCovered = true; // Assume all covered

        // 3- Iterate on isCovered array, if an index was false; return false
        for (int i = 0; i < 5; i++)
            if (!isCovered[i]) {
                allCovered = false; // Find one number is not covered
                break;
            }

        // Display result
        if (allCovered)
            System.out.println("\nThe tickets cover all numbers");
        else
            System.out.println("\nThe tickets don't cover all numbers");
    }
}
