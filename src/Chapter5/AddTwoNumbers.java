package Chapter5;
import java.util.Scanner;
public class AddTwoNumbers {
    public static void main(String[] args) {

        //  Generate two random single-digit integers
        int number1 = (int) (Math.random() * 10);
        int number2 = (int) (Math.random() * 10);
        int sum = number1 + number2;

        //  Prompt the student to answer: What is number1 + number2 ?
        System.out.print("What is " + number1 + " + " + number2 + " ? ");
        Scanner input = new Scanner(System.in);
        int answer = input.nextInt();

        while (answer != sum) {
            System.out.print("Your answer is not correct.");
            System.out.print("What is " + number1 + " + " + number2 + " ? ");

            answer = input.nextInt();
        }
        System.out.print("Your answer is correct. Thank you.");
    }
}
