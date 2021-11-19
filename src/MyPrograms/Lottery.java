package MyPrograms;

import java.util.Scanner;

public class Lottery{
    public static void main(String[]args){
    Scanner input = new Scanner(System.in);
    //prompt the user for input
        int lottery=(int)(10+Math.random()*90);
        System.out.println("lottery number"+lottery);
        int lotteryFirstDigit=lottery%10;
        int lotterySecondDigit=lottery/10;
        System.out.print("Enter a two digit number:");
        int UserNumber=input.nextInt();
        int UserFirstDigit=UserNumber%10;
        int UserSecondDigit=UserNumber/10;
    if ((UserFirstDigit==lotteryFirstDigit)&&(UserSecondDigit==lotterySecondDigit)) {
        System.out.println("You win $10,000!!!");
    }
        else if ((UserFirstDigit==lotterySecondDigit)&&(UserSecondDigit==lotteryFirstDigit)) {
        System.out.println("You Win $3000!!! ");
         }
            else if ((UserFirstDigit==lotteryFirstDigit)||(UserFirstDigit==lotterySecondDigit)||
            (UserSecondDigit==lotteryFirstDigit)||(UserSecondDigit==lotterySecondDigit)) {
        System.out.println("You Win $1000!!!");
            }
                else {
                    System.out.println("Sorry: Bad Luck!");
            }


    }

}
