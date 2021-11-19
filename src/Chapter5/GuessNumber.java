package Chapter5;
import java.util.Scanner;
public class GuessNumber {
    public static void main(String[] args) {

        // 1. Generate a random 2-digit integer
          int number = (int) (Math.random() * 101);
          System.out.print("numberis "+number);
          int ans;
    do {
        System.out.print("Enter a number between 0 and 100:  ");
         Scanner input = new Scanner(System.in);
           ans = input.nextInt();
         if (ans == number)
              System.out.print("You caught the right number!! ");
         else if (ans > number)
              System.out.print("Your number is too high ");
         else System.out.print("Your number is too low ");

   } while ( ans != number );

    }
}