package MyPrograms;
import java.util.Scanner;
public class CalcDayOfWeek {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // Prompt the user to enter the year
        System.out.print("Enter year: (e.g.,2012):");
        int year = input.nextInt();

        // Prompt the user to enter the month
        System.out.print("Enter month:1-12: ");
        int m = input.nextInt();


        // Prompt the user to enter the day of the month
        System.out.print("Enter the day of the month:1-31: ");
        int q = input.nextInt();


        if ((m==1)||(m==2)) {
            m=m+12;
            year=year-1;

        }


        //Calculate Century
        int j=year/100;

        //Calculate the year of the century
        int k=year%100;

        // Calculate the day of the week
        int h=(q+26*(m+1)/10+ k+k/4+j/4+5*j)%7;

        System.out.print("Day of the week: ");
        switch(h) {
            case 0:
                System.out.println("Saturday");
                break;
            case 1:
                System.out.println("Sunday");
                break;
            case 2:
                System.out.println("Monday");
                break;
            case 3:
                System.out.println("Tuesday");
                break;
            case 4:
                System.out.println("Wednesday");
                break;
            case 5:
                System.out.println("Thursday");
                break;
            case 6:
                System.out.println("Friday");
                break;
        }

    }
}