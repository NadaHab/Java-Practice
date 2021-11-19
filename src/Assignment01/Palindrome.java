package Assignment01;

import java.util.Scanner;
public class Palindrome {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a three-digit integer: ");
        String Pal = input.next();


        if (Pal.charAt(0)==Pal.charAt(2))
        System.out.print(Pal+ " is a palindrome ");
        else
        System.out.print(Pal+ " is not a palindrome ");


    }
}