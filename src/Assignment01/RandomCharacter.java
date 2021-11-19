package Assignment01;

import java.util.Scanner;
public class RandomCharacter {
    public static void main(String[] args) {

        char random = (char) ((int) 'A' + Math.random() * ((int) 'Z' - (int) 'A' + 1));
        System.out.print("The random character is: " + random);

    }
}
