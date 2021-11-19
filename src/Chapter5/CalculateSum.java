package Chapter5;
import java.util.Scanner;
public class CalculateSum {

    public static void main(String[] args) {
        int sum=0;
        System.out.println("This program adds as much numbers as you need.");
        System.out.println("Enter a zero when you want to stop adding.");
        System.out.print("Enter a number:   ");
        Scanner input = new Scanner(System.in);
        int userNum = input.nextInt();
        while (userNum != 0){
            sum=sum+userNum;
            System.out.print("Enter a number  ");
            Scanner input1 = new Scanner(System.in);
            userNum = input.nextInt();

        }
        System.out.print("The sum of numbers is: "+sum);
    }
}