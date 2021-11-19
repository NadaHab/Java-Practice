package chapter5;

import java.util.Scanner;

public class Dec2Hex {

    // Hex to Dec
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // Prompt the user to enter a currentDecimal integer
        System.out.print("Enter a currentDecimal number: ");
        int currentDecimal = input.nextInt();

        // Convert currentDecimal to finalHex
        String finalHex = "";

        while (currentDecimal != 0) {

            // Save the remainder
            // In last portion of currentDecimal we have a number smaller than 16
            // Get that Number
            //...........................
            int hexValue = currentDecimal % 16;
            //...........................
            System.out.println("Current remainder to be convert to Hex: " + hexValue);

            // Convert a Decimal value to a Hex digit
            // Calculate the ASCII for the reminder which is between 0 and 15.
            // If reminder(hexValue) is between 0  and 9
            //         add this number to 48 ('0' => 48 in ASCII)
            // Otherwise get the reminder which is between 10 and 15
            //         calculate how much it is bigger than 9 (hexValue - 10)
            //         add this number to 65 ('A' => 54 in ASCII)
            //         so if the remain part which is bigger than 9 is 3 we have to
            //         add 3 to 65 to get to equivalent ASCII number for current processing part
            char currentHexDigit = (hexValue >= 0 && hexValue <= 9) ?
                            (char) (hexValue + '0') :           // (char) (hexValue + 48) :
                            (char) (hexValue - 10 + 'A');       // (char) (hexValue + 65) :
            finalHex = currentHexDigit + finalHex;


            // DROP THE LAST DIGIT AND Go to the next POSITIONAL NOTATION  123:  1 <- 2 <- 3
            // Or we can say drop the reminder which already is converted and consider the rest
            //...........................
            currentDecimal = currentDecimal / 16;
            //...........................
            System.out.println("Current finalHex:    " + finalHex);
            System.out.println("Move to the Next POSITIONAL NOTATION. Quotion to 16:    " + currentDecimal);
        }
        System.out.println("The finalHex number is " + finalHex);
    }
}