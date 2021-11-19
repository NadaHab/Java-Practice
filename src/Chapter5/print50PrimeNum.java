package Chapter5;
import java.util.Scanner;
public class print50PrimeNum {
    public static void main(String[] args) {
        int num=1;
        int i=1;


        while (i<=50){
            if ((num==2)||(num==3)||(num==5)||(num==7))
                System.out.print(num+" ");

            if ((num%2!=0)&&(num%3!=0)&&(num%5!=0)&&(num%7!=0)) {
                System.out.print(num + " ");
                i++;
            }
            num++;
        }
    }
}
