package Assignment01;

import java.util.Scanner;

public class CheckSubstring {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Input string s1: ");
        String s1 = input.next();

        Scanner input1 = new Scanner(System.in);
        System.out.print("Input string s2: ");
        String s2 = input.next();

        if (s1.contains(s2))
        System.out.print(s2+" is a substring of "+s1);
        else
        System.out.print(s2+" is not a substring of "+s1);
    }


}
