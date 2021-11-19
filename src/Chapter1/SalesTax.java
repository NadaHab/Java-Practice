package chapter2;


import java.util.Scanner;

public class SalesTax {

    public static void main(String[] args) {

        System.out.print("Enter purchase amount: ");

        Scanner input = new Scanner(System.in);
        double purchaseAmount = input.nextDouble();

        double tax = purchaseAmount * 0.15;
        System.out.println("Sales tax is " + (int) (tax * 100) / 100.0);
    }
}
