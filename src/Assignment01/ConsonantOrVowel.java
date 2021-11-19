package Assignment01;

import java.util.Scanner;
public class ConsonantOrVowel {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a letter: ");
        char letter = sc.next().charAt(0);

        if ((letter == 'A')||( letter == 'a')||(letter == 'I')||( letter == 'i')||(letter == 'O')||( letter == 'o')||
                (letter == 'U')||( letter == 'u')||(letter == 'E')||( letter == 'e')||(letter == 'Y')||( letter == 'y'))
            System.out.println(letter + " is a vowel letter.");
        else if ((letter >= 'a' && letter <= 'z')||(letter >= 'A' && letter <= 'Z'))
            System.out.println(letter + " is a consonant letter.");
        else
            System.out.println(letter + " is an invalid input.");
    }

}
