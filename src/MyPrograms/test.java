package MyPrograms;

public class test {
    public static void main(String[] args) {
        int[] list = {1, 2, 3, 4, 5,6,7,8,9};
        System.out.println("old list is:");

        for (int i = 0; i < list.length; i++)
            System.out.print(list[i] + " ");
        System.out.println();
        reverse(list);

    }
    public static void reverse(int[] list) {
        int[] newList = new int[list.length];
        for (int i = 0; i < list.length; i++)
            newList[i] = list[list.length - 1 - i];
        list = newList;
        System.out.println("new list becomes:");
        for (int i = 0; i < newList.length; i++)
            System.out.print(newList[i] + " ");
    }

}
