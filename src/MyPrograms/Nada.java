package MyPrograms;

import java.util.Scanner;

import static java.lang.Character.isLowerCase;

public class Nada {
    public static void replaceOddIndexes(String str) {
        int len=str.length(); // length of string str
       System.out.print("1_ Replace every character at odd index with &:");
        int i;
        for (i=0;i<len;i++){
            if (i%2==0)
                System.out.print(str.charAt(i));
            else
                System.out.print("&");
        }
        System.out.println();
    }

    private static int length(String str) {
        return 0;
    }

    public static void uniqueCharacter(String str) {
        int length = str.length();

    }

    public static void numberOfLowerCases(String str) {
        //Number of Lowercases in string str
        int numLower=0;
        boolean lowerCase;
        int len=str.length(); // length of string str
        int i;
        for (i=1;i<len;i++){
           if (lowerCase=isLowerCase(str.charAt(i)))
                    numLower++;
        }
        System.out.println("3_ Numbers of lowercase letters: "+numLower);

    }

    public static void numberOfDigits(String str) {

        int numDigits=0; //Number of digits in string str
        boolean isDigitChar; // is true when the string character is a digit
        int len=str.length(); // length of string str
        int i;
        //For loop to count the digits
        for (i=1;i<len;i++){

            if (isDigitChar=Character.isDigit(str.charAt(i))) {
                numDigits++;
            }
        }
        System.out.println("4_ Numbers of digits: "+numDigits);



    }

    public static void orangeApple(int num) {
        if ((num<1)||(num>20))
            System.out.println("Number should be between 1 and 20.");
        else {
            //Check if number is divisible by 2 and 3
            if ((num % 2 == 0) && (num % 3 == 0))
                System.out.println("Apple-Orange");
                //Check if number is divisible by 2
            else if (num % 2 == 0)
                System.out.println("Apple");
                //Check if number is divisible by 3
            else if (num % 3 == 0)
                System.out.println("Orange");
        }



    }

    public static void userInput() {

        int result; // used to check if the string is "exit"

        char userContinue='y';
        String userInput="     ";

        do {
            int i=1;
            System.out.println("Please select your input type:");
            System.out.println(" 1- int          2-double      3-String");
            Scanner input = new Scanner(System.in);
            Scanner sc = new Scanner(System.in);
            int answer = input.nextInt();


            if (answer == 1) {
                System.out.print("Please enter an integer:");
                userInput = input.nextLine();
                result = userInput.compareTo("exit"); // check if the input is "exit"

                while ((result != 0) && (i <= 2)) {
                    System.out.print("Please enter an integer:");
                    userInput = input.nextLine();
                    result = userInput.compareTo("exit"); // check if the input is "exit"


                    if (result == 0) { //user entered "exit"
                        System.out.println("Thank you");
                        i = 3;
                    }

                    i++;
                }
            } else if (answer == 2) {

                System.out.print("Please enter a double:");
                userInput = input.nextLine();
                result = userInput.compareTo("exit"); // check if the input is "exit"

                while ((result != 0) && (i <= 2)) {
                    System.out.print("Please enter a double:");
                    userInput = input.nextLine();
                    result = userInput.compareTo("exit"); // check if the input is "exit"


                    if (result == 0) { //user entered "exit"
                        System.out.println("Thank you");
                        i = 3;
                    }

                    i++;
                }
            } else if (answer == 3) {

                System.out.print("Please enter a double: ");
                userInput = input.nextLine();

                result = userInput.compareTo("exit"); // check if the input is "exit"

                while ((result != 0) && (i <= 2)) {
                    System.out.print("Please enter a double:");
                    userInput = input.nextLine();
                    result = userInput.compareTo("exit"); // check if the input is "exit"


                    if (result == 0) { //user entered "exit"
                        System.out.println("Thank you");
                        i = 3;
                    }

                    i++;
                }
            }
            System.out.println("Do you want to continue:y/n");
           userContinue = sc.next().charAt(0);


        } while (userContinue=='y');

    }



    public static void main(String[] args) {
        replaceOddIndexes("Welcome to Java");
        uniqueCharacter("mnbvcxz");
        uniqueCharacter("qazwsxx");
        numberOfLowerCases("Welcome to Java");
        numberOfDigits("Welcome 20 to 21 Java");
        orangeApple(6);
        userInput();
    }
}

