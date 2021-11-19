package MyPrograms;

public class Merge2SortedLists {


    public static void mergeTwoSortedLists(int[] array1, int[] array2) {
        int lengthArray1 = array1.length;
        int lengthArray2 = array2.length;
        int[] merge = new int[lengthArray1 + lengthArray2];
        int i = 0, j = 0, k = 0, x;
        // counter is added +1 when element in Array1= element in Array2
        int counter = 0;
        // Print the first list
        System.out.print("List 1: ");
        for (x = 0; x < lengthArray1; x++)
            System.out.print(array1[x] + " ");
        // Print the second list
        System.out.print("\nList 2: ");
        for (x = 0; x < lengthArray2; x++)
            System.out.print(array2[x] + " ");
        // Insert numbers into the merged array till the shortest length
        while (i < lengthArray1 && j < lengthArray2) {
            //If the 2 elements are equal, we insert it only once into "merge"
            if (array1[i] == array2[j]) {
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
        System.out.print("\nList after merging: ");
        for (x = 0; x < lengthArray1 + lengthArray2 - counter; x++)
            System.out.print(merge[x] + " ");
        System.out.println();
        return;
    }

    public static void main(String[] args) {
        mergeTwoSortedLists(new int[]{1, 2, 5, 7}, new int[]{1, 2, 3, 6, 9, 10, 15, 17});
        mergeTwoSortedLists(new int[]{15,20, 25, 35, 38}, new int[]{15, 20, 25, 40});
    }
}


