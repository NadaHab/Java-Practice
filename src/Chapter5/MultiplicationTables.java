package Chapter5;
import java.util.Scanner;
public class MultiplicationTables { //Prints the multiplication Tables
    public static void main(String[] args) {
        int i;
        int j;
        System.out.println("Multiplication Table ");
        System.out.println("     ");
        for(j=1;j<=9;j++) {
            System.out.print("    "+j);
        }
        System.out.println();
        System.out.println("--------------------------------------------");
        for (i=1; i<=10;i++){
            System.out.print(i+"|");
            for(j=1;j<=10;j++){
                System.out.printf("%4d",i*j);
            }
            System.out.println();
        }
    }
}
