package MyPrograms;

import java.util.Scanner;
public class Assignment03Nada{

    public static String sort(String s){
        int i=0;
        int j;
        char temp; //used in swapping

        int stringLength= s.length();
        char [] array= new char[s.length()];

        //1- copy the string characters into array
        while (i<s.length()) {
            array[i]=s.charAt(i);
            if (i<(s.length()))
                i++;
        }
        //2- Sort the array characters
        for (j=1;j<s.length();j++) {

            for(i=0;i<(s.length()-1);i++) {
                if (array[i]>array[i+1]) { //swap
                    temp = array[i];
                    array[i] = array[i+1];
                    array[i+1] = temp;
                }
            }
        }
        i=0;
        s="";
        //3- Copy back the array characters to string s
        while (i<stringLength) {
            s= s+ array[i];
            i++;
        }
        return s;
    }

    public static String convertMillis(long millis){
        //1- Perform calculations
        long seconds=(millis/1000)%60;
        long minutes=((millis/1000)/60)%60;
        long hours=((millis/1000)/60)/60;

        // 2- Concatinate the values into string str
        String str=hours+ "  hours   "+ minutes+"  minutes    "+ seconds+ "  seconds";
        return str;
    }

    public static void analyzeScores(){
        double [] scores= new double[100];
        java.util.Scanner input=new java.util.Scanner(System.in);
        System.out.println("Enter Scores till a negative number: ");
        int i=0; int j;
        double sum=0;
        double average=0;
        scores[i]=input.nextDouble();

        // 1- fill the array from the keyboard by the user and calculate their sum
        while ((scores[i]>0)&&(i<100)){
            sum=sum+scores[i];
            i++;
            scores[i]=input.nextDouble();
        }
        if (i>0) //in case -1 is entered at first, to avoid dividing by 0
            average = sum / i;

        //2- Calculate number of scores >=average
        int SumMoreThanAverage=0;
        for (j=0;j<i;j++){
            if ((scores[j])>=average)
                SumMoreThanAverage++;
        }
        if (i>=0) {
            System.out.println("The number of scores that are greater or equal to the average are:" + SumMoreThanAverage);
            System.out.println("The number of scores that are less than the average are:" + (i - SumMoreThanAverage));
        }

    }

    public static void PrintDistinctNumbers(){
        int index=0; //points to the length of the numbers in the array
        int i; int j; //loop counters
        int found; //value=1 when the number is found in the array
        int temp; //temporary input storage
        int [] numArray= new int[10];

        java.util.Scanner input=new java.util.Scanner(System.in);

        System.out.println("Please enter 10 numbers: ");
        //1- Enter the 10 numbers
        for ( j=0; j<10; j++) {
            found = 0;
            temp = input.nextInt();
            i = 0;

            //2- Check if the value entered is already in the array
            while ((i < 10) && (found == 0)) {
                if (temp == numArray[i])
                    found = 1;
                i++;
            }
            //3- If value entered is not found, we add it to the array
            if (found == 0) {
                numArray[index] = temp;
                index++;
            }
        }
        System.out.println("The number of distinct numbers is:"+ index);
        System.out.print("The distinct numbers are: ");

        //4- Print the distinct numbers
        for (int k=0;k<index;k++) {
            System.out.print(numArray[k] + " ");
        }

        return;
    }


    public static void main(String[] args){

        System.out.println("Sorting the string:" + sort("acb"));
        System.out.println("Convert to hours, minutes and seconds: "+ convertMillis( 123456789));
        analyzeScores();
        PrintDistinctNumbers();
    }
}


