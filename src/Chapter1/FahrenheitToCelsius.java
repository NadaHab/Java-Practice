package chapter2;

import java.util.Scanner;

public class FahrenheitToCelsius {

    public static void main(String[] args) {

        System.out.print("Enter a degree in Fahrenheit: ");

        Scanner input = new Scanner(System.in);
        double fahrenheit = input.nextDouble();

        // Convert Fahrenheit to Celsius
        double celsius = (5.0 / 9) * (fahrenheit - 32);
        System.out.println("Fahrenheit " + fahrenheit + " is " +
                celsius + " in Celsius");
    }
}