package Chapter5;
import java.util.Scanner;
public class GreatestComDiv {
    public static void main(String[] args) {
        int k=2;

        int gcd=1;
        System.out.print("What first number ");
        Scanner input = new Scanner(System.in);
        int n1 = input.nextInt();
        System.out.print("What second number ");
        int n2 = input.nextInt();


        while (k<=n1&&k<=n2){
            if ((n1%k==0)&&(n2%k==0))
                gcd=k;
                k++;

        }
        System.out.println("The GCD is"+ gcd);
        }
}
