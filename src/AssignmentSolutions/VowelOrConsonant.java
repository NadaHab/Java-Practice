package AssignmentSolutions;
import java.util.Scanner;

public class VowelOrConsonant {
  public static void main(String[] args) {
    char letter;
    int i;
    Scanner input = new Scanner(System.in);
    for (i = 1; i < 5; i++) {
      System.out.print("Enter a letter: ");
      letter = input.nextLine().charAt(0);

      if (Character.toUpperCase(letter) == 'A' || Character.toUpperCase(letter) == 'E' || Character.toUpperCase(letter) == 'I'
              || Character.toUpperCase(letter) == 'O' || Character.toUpperCase(letter) == 'U')
        System.out.println(letter + " is a vowel");
      else if (Character.isLetter(letter))
        System.out.println(letter + " is a consonant");
      else
        System.out.println(letter + " is an invalid input");
    }
  }
}