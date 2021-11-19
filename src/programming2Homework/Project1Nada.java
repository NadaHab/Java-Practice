package programming2Homework;/*                                Add Binary (LeetCode 67)
Presented on 3 November, 2021 by MyPrograms.Nada Haber
-------------------------------------------------------------------------------------------------------
Part 1:  Day of the Week (leetcode 1185)
Link:https://leetcode.com/problems/day-of-the-week

Problem:
---------
Given the year, month, and day. Calculate what day it was.

Example 1:
----------
Input: year="2021"  m="11"  q="2"
Output: "Tuesday"

Example 2:
-----------
Input: year="2000"  m="10"  q="30"
Output: "Saturday"

Solution:
----------
Use the formulas invented by Zeller, called "Zeller's Congruence"
--------------------------------------------------------------------------------------------------------
Part 2:  Find Second Largest number in a string (leetcode 1196)

Link:https://leetcode.com/problems/second-largest-digit-in-a-string

Problem:
---------
Find the second highest number in a string

Example 1:
----------
Input: " 1 2 3 4 5 6 7 8 "
Output: "7"

Example 2:
-----------
Input: " 4 7 3 8 5 9 12"
Output: "9"

Solution:
----------
Sort the inputed string and print the element in the  array position before the last.
--------------------------------------------------------------------------------------------------------
Part 3:  Convert binary number to decimal(leetcode 1290)

Link:https://leetcode.com/problems/convert-binary-number-in-a-linked-list-to-integer

Problem:
---------
Enter a binary number and print it in decimal system.

Example 1:
----------
Input: " 11101"
Output: 29

Example 2:
-----------
Input: " 10101010"
Output: 170

Solution:
----------
Use a loop to do the calculation from binary to decimal.
--------------------------------------------------------------------------------------------------------
Part 4:  Merge Two sorted lists(leetcode 21)

Link:https://leetcode.com/problems/merge-two-sorted-lists

Problem:
---------
Having 2 sorted lists of numbers, merge them into a third sorted list.

Example 1:
----------
Input: " 1 2 5 7"  "1 3 6 9 10 15 17"
Output: "1 2 3 5 6 7 9 10 15 17"

Example 2:
-----------
Input: " 20 25 35 38"  "15 25 40"
Output: "15 20 25 35 38 40"

Constraint:
-----------
The 2 initial arrays should have sorted elements.

Solution:
----------
Create a third array and move the elements of the two arrays sorted into it
--------------------------------------------------------------------------------------------------------
*/
//package FirstProjectI;

import java.util.Scanner;

public class Project1Nada {

    public static int enterChoiceOfOperation() {
        int choice;
        do {
            System.out.println("\nPlease enter the choice of operation 1 to 4: To exit enter 0");
            System.out.println("1- Calculate the day of the week:");
            System.out.println("2- Find the second highest number:");
            System.out.println("3- Convert a binary number to decimal:");
            System.out.println("4- Merge two sorted lists:");
            Scanner input = new Scanner(System.in);
            choice = input.nextInt();
        } while ((choice < 0) || (choice > 4));
        return choice;
    }

    public static void calculateDayOfWeek() { //** Zeller’s congruence **

        Scanner input = new Scanner(System.in);

        // Prompt the user to enter the year
        System.out.print("Enter year: (e.g.,2012):");
        int year = input.nextInt();

        // Prompt the user to enter the month
        System.out.print("Enter month:1-12: ");
        int month = input.nextInt();

        // Prompt the user to enter the day of the month
        System.out.print("Enter the day of the month:1-31: ");
        int day = input.nextInt();

        // If month= January, then it should go as 13 to the formula in choice; + decrease year by 1
        // If month= February, then it should go as 14 to the formula in choice + decrease year by 1
        // else March=3, April=4 ... December=12
        if ((month == 1) || (month == 2)) {
            month = month + 12;
            year = year - 1;

        }

        //Calculate Century
        int century = year / 100;

        //Calculate the year of the century
        int yearOfCentury = year % 100;

        // Calculate the day of the week
        int choice = (day + 26 * (month + 1) / 10 + yearOfCentury + yearOfCentury / 4 + century / 4 + 5 * century) % 7;

        System.out.print("Day of the week: ");
        // Results according to Zeller's Congruence
        switch (choice) {
            case 0:
                System.out.println("Saturday");
                break;
            case 1:
                System.out.println("Sunday");
                break;
            case 2:
                System.out.println("Monday");
                break;
            case 3:
                System.out.println("Tuesday");
                break;
            case 4:
                System.out.println("Wednesday");
                break;
            case 5:
                System.out.println("Thursday");
                break;
            case 6:
                System.out.println("Friday");
                break;
        }

    }


    public static void sort(int arr[]) {
        //* Sorts an array arr[] elements in increasing order*/


        for (int i = 0; i < arr.length - 1; i++) {
            // Find the minimum element in unsorted array
            int min_idx = i; // returns the index of the minimun element
            for (int j = i + 1; j < arr.length; j++)
                if (arr[j] < arr[min_idx])
                    min_idx = j;

            // Swap the found minimum element with the first
            // element
            int temp = arr[min_idx];
            arr[min_idx] = arr[i];
            arr[i] = temp;
        }
        return;
    }

    public static void findSecondHighest() {
        System.out.println("Please enter how many numbers you want to work with:");
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int[] array = new int[n];
        System.out.println("Please enter " + n + " numbers:");

        //Enter the numbers
        for (int i = 0; i < array.length; i++) {
            array[i] = input.nextInt();
        }

        // sort the numbers using method sort
        sort(array);
        System.out.println("The second largest number is: " + array[array.length - 2]);
        System.out.println();
        return;
    }

    public static void convertBinaryToDecimal() {

        System.out.println("Please enter a binary number:");
        Scanner input = new Scanner(System.in);
        long binaryNum = input.nextLong();
        int decimalNumber = 0;
        int i = 0;
        long remainder;
        long num = binaryNum;
        // while loop to calculate the decimal
        while (num != 0) {
            remainder = num % 10;
            num = num / 10;
            decimalNumber += remainder * Math.pow(2, i);
            i++;
        }
        System.out.println("Binary to Decimal");
        System.out.println(binaryNum + " = " + decimalNumber);

        return;
    }

    public static void mergeTwoSortedLists() {
        int[] array1 = {1, 2, 5, 7};
        int lengthArray1 = array1.length;
        int[] array2 = {1, 3, 6, 9, 10, 15, 17};
        int lengthArray2 = array2.length;
        int[] merge = new int[lengthArray1 + lengthArray2];
        int i = 0, j = 0, k = 0, x;
        int counter = 0; // is added +1 when element in Array1= element in Array2
        // Print the first list
        System.out.print("Array 1: ");
        for (x = 0; x < lengthArray1; x++)
            System.out.print(array1[x] + " ");
        // Print the second list
        System.out.print("\nArray 2: ");
        for (x = 0; x < lengthArray2; x++)
            System.out.print(array2[x] + " ");
        // Insert numbers into the merged array till the shortest length
        while (i < lengthArray1 && j < lengthArray2) {
            if (array1[i] == array2[j]) { //If the 2 elements are equal, we insert it only once into "merge"
                merge[k] = array1[i];
                k++;
                i++;
                j++;
                counter++;
            } else if (array1[i] < array2[j]) {
                merge[k] = array1[i];
                k++;
                i++;
            } else
                merge[k++] = array2[j++];
        }
        // If the first list is longer, add it's remaining numbers into the merged array
        while (i < lengthArray1)
            merge[k++] = array1[i++];
        // If the second list is longer, add it's remaining numbers into the merged array
        while (j < lengthArray2)
            merge[k++] = array2[j++];
        System.out.print("\nArray after merging: ");
        for (x = 0; x < lengthArray1 + lengthArray2 - counter; x++)
            System.out.print(merge[x] + " ");
        System.out.println();
        return;
    }


    public static void main(String[] args) {
        int choice;
        do {
            choice = enterChoiceOfOperation();
            switch (choice) {
                case 0:
                    System.out.println("End of program. Thank you.");
                    break;
                case 1:
                    calculateDayOfWeek();
                    break;
                case 2:
                    findSecondHighest();
                    break;
                case 3:
                    convertBinaryToDecimal();
                    break;
                case 4:
                    mergeTwoSortedLists();
            }
        } while (choice != 0);
    }
}

