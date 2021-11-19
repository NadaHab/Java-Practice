package MyPrograms;

public class ReverseArrayWithoutCopying {
    public static void main(String[] args) {
        int[] list = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        int i;
        int j = list.length;
        int temp;

        for (i = 0; i < list.length / 2; i++) {
            temp = list[i];
            list[i] = list[j-1];
            list[j-1] = temp;
            j = j - 1;
        }
        for (i=0;i<(list.length);i++) {
            System.out.print(list[i]);
        }
    }
}
