public class Nada {

    public static void distinctNumbersInAnArray(int numArray[]) {
        // ** Prints the distinct numbers in an array one time each
        int i;
        int j; //loop counters

        // create an array "found" and set its elements to zeros
        int[] found = new int[10];
        for (i = 0; i < 10; i++) {
            found[i] = 0;
        }
// we go through the array. For each element in the array, We set found[element]=1
        for (i = 0; i < numArray.length; i++) {
            for (j = 0; j < numArray.length; j++) {
                if (numArray[j] == i)
                    found[i] = 1;

            }
        }
        System.out.print("1_ The distinct numbers are: ");
        for (i = 0; i < 10; i++) {
            if (found[i] == 1)
                System.out.print(i + "  ");

        }

        return;
    }


    public static void occurrencesOfEachNumber(int numArray[]) {
        //** Takes as input an array numArray and prints the number of occurrences of numbers 0 to 9
        int i;
        int j; //loop counters

        int[] found = new int[10]; // array to store the occurrences of numbers between 0 and 9
        for (i = 0; i < 10; i++) {
            found[i] = 0;
        }
// We go through the array element by element and increment the counter in array found
        for (i = 0; i < numArray.length; i++) {
            for (j = 0; j < numArray.length; j++) {
                if (numArray[j] == i)
                    found[i]++;
            }
        }
        System.out.println("\n2_ Occurences of each number: ");
        for (i = 0; i < 10; i++) {
            if (found[i] != 0)
                System.out.println(i + " : " + found[i]);
        }
        return;

    }

    public static void secondLargestElement(int numArray[]) {
        //** Finds the second largest element in array numArray
        int i;
        int j;
        int firstLargest = 0;
        int secondLargest = 0;

        // loop to find the first largest number
        for (i = 0; i < numArray.length; i++) {
            if (numArray[i] > firstLargest)
                firstLargest = numArray[i];

        }
        // loop to find the second largest number
        for (i = 0; i < numArray.length; i++) {

            if ((numArray[i] != firstLargest) && (numArray[i] > secondLargest)) {

                secondLargest = numArray[i];
            }
        }


        System.out.println("3_ Second largest element: " + secondLargest);

        return;

    }

    public static boolean equals(int[] list1, int[] list2) {
        //** Returns true if the 2 arrays list1 and list2 are strictly identical*/
        boolean identical = true;
        int i = 0;
        if ((list1.length != list2.length) || (list1.length > list2.length) || (list1.length < list2.length))
            identical = false;
        else {

            while ((i < list1.length) && (identical = true)) {
                if (list1[i] != list2[i])
                    identical = false;
                i++;
            }
        }

        return identical;
    }

    public static boolean isConsecutiveFour(int[] values) {
        //** Returns true if 4 consecutive values are equal in the array "values"
        boolean isConsecutive = false;
        for (int i = 0; i < values.length - 3; i++) {
            if ((values[i] == values[i + 1]) && (values[i + 1] == values[i + 2]) && (values[i] == values[i + 3]))
                isConsecutive = true;
        }

        return isConsecutive;

    }


    public static void main(String[] args) {

        distinctNumbersInAnArray(new int[]{1, 2, 3, 2, 1, 6, 3, 4, 5, 2});
        occurrencesOfEachNumber(new int[]{1, 2, 3, 2, 1, 6, 3, 4, 5, 11});
        secondLargestElement(new int[]{1, 2, 3, 2, 1, 6, 3, 4, 5, 2});
        System.out.println("4_ Array equal: " + equals(new int[]{1, 2, 3, 2, 1, 6, 3, 4, 5, 2}, new int[]{1, 2, 3, 2, 1, 6, 3, 4, 5, 2}));
        System.out.println("5_ Array has four consecutive numbers: " + isConsecutiveFour(new int[]{1, 2, 2, 2, 1, 6, 3, 4, 5, 2, 2, 2, 2}));
    }
}

