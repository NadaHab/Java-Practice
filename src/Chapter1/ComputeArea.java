package chapter1;
import com.sun.security.auth.module.NTSystem;

import java.util.Scanner;

public class ComputeArea {

    public static void main(String[] args) {

        // Prompt the user to enter a radius
        System.out.print("Enter a number for radius: ");

        // Create a Scanner object
        Scanner input = new Scanner(System.in);
        double radius = input.nextDouble();

        // Compute area
        double area = radius * radius * 3.14159;

        // Display result
        System.out.println("The area for the circle of radius " +
                radius + " is " + area);
    }
}

