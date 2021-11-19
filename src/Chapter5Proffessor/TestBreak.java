package chapter5;

public class TestBreak {

    public static void main(String[] args) {
        int sum = 0;
        int number = 0;

        while (number < 20) {
            number++;
            sum += number;
            System.out.println("number is: " + number + "\tsum is: " + sum);
            if (sum >= 100) break;
        }

        System.out.println("\nAfter the break outside the loop. \nnumber is: " + number + "\tsum is: " + sum);
    }
}
