package myTwoDimArrays;

import java.util.Scanner;
public class InitializeRandom {
public static void sort(int arr[]) {
        //* Sorts an array arr[] elements in increasing order*/
        for (int i = 0; i < arr.length - 1; i++) {
        // Find the minimum element in unsorted array
        int minIndex = i; // returns the index of the minimun element
        for (int j = i + 1; j < arr.length; j++)
        if (arr[j] < arr[minIndex])
            minIndex = j;

        // Swap the found minimum element with the first
        // element
        int temp = arr[minIndex];
        arr[minIndex] = arr[i];
        arr[i] = temp;
        }
        return;
        }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[][] matrix = new int[10][10];

// Fill with random numbers
        for (int row = 0; row < matrix.length; row++) {
            for (int column = 0; column < matrix[row].length; column++) {
                matrix[row][column] = (int) (Math.random() * 100);
            }
        }
// sort according to matrix Row
        for (int row = 0; row < matrix.length; row++) {
            sort (matrix[row]);
        }
//        for (int column = 0; column < matrix(0).length; column++) {
//            sort (matrix[][column]);
//        }
//        --------------------------------------------------------------------------
//        for (int column = 0; column < matrix[column].length; column++) {
//            int temp=0;
//            for (int row = 0; row < matrix.length; row++){
//               sort (matrix[row][])
//            }
//            Summing elements by column
//            for (int column = 0; column < matrix[0].length; column++) {
//                int totalOfCurrentColumn = 0;
//                for (int row = 0; row < matrix.length; row++){
//                    totalOfCurrentColumn += matrix[row][column];
//                }
//                System.out.println("Sum for column " + column + " is ” + total);
//            }
//-------------------------------------------------------------------------------------------------
//            Initializing arrays with input values
//            ---------------------------------------
//            java.util.Scanner input = new Scanner(System.in);
//            System.out.println("Enter " + matrix.length + " rows and " +
//                    matrix[0].length + " columns: ");
//            for (int row = 0; row < matrix.length; row++) {
//                for (int column = 0; column < matrix[row].length; column++) {
//                    matrix[row][column] = input.nextInt();
//                }
//            }
//--------------------------------------------------------------------------------------------------
        for (int row = 0; row < matrix.length; row++) {
            for (int column = 0; column < matrix[row].length; column++) {
                System.out.printf("%4d",matrix[row][column]);
            }
            System.out.println();
        }
    }
}
