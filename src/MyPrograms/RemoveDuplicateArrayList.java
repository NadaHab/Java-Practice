package MyPrograms;
import java.util.ArrayList;
import java.util.Scanner;

public class RemoveDuplicateArrayList {
    public static void main(String[] args) {
        ArrayList<Integer> arrayL = new ArrayList<Integer>();
        fillArrayList(arrayL);
        removeDuplicates(arrayL);
        printAfterDeletion(arrayL);
    }

    public static void fillArrayList(ArrayList<Integer> list) {
        int num;
        System.out.print("Please enter 10 integers: ");
        Scanner input = new Scanner(System.in);
        for (int i = 0; i < 10; i++) {
            num = input.nextInt();
            list.add(i, num);
        }
        System.out.println("List=" + list);
    }

    public static void removeDuplicates(ArrayList<Integer> list) {
        boolean found = false;
        int j = 0;
        for (int i = 0; i < list.size(); i++) {
            j = i + 1;
            while (j < list.size()) {
                if (list.get(i) == list.get(j))
                    list.remove(j);
                else
                    j++;
            }
        }
    }

    public static void printAfterDeletion(ArrayList<Integer> list) {
        System.out.print("List after deleting the duplicates:");
        for (int i = 0; i < list.size(); i++)
            System.out.print(list.get(i) + " ");

    }
}
