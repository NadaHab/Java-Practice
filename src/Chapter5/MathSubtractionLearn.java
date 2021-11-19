package Chapter5;
import java.util.Scanner;
public class MathSubtractionLearn {
    public static void main(String[] args) {
        int count = 0;
        int answer = 0;
        int i = 0;
        Scanner input = new Scanner(System.in);

        while (i < 5) {
            int number1 = (int) (Math.random() * 10);
            int number2 = (int) (Math.random() * 10);

            //  If number1 < number2, swap number1 with number2
            if (number1 < number2) {
                int temp = number1;
                number1 = number2;
                number2 = temp;
            }
            System.out.print("What is " + number1 + " - " + number2 + " ? ");

            answer = input.nextInt();
            if (answer == number1 - number2)
                count++;
            i++;
        }
        System.out.println("Number of correct answers is: " + count);


    }
}
