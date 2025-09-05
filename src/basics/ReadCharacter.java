package basics;

import java.util.Scanner;
public class ReadCharacter {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("enter a character :");
        char character = input.next().charAt(1);
        System.out.println("your characters are :"+ character);

    }
}
