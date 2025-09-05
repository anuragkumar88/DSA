package basics;

import java.util.Scanner;
public class UserInput {
    public static void main(String[] args) {
        Scanner Input = new Scanner(System.in);
        System.out.println("Enter your Name :");
        String name = Input.next(); // here only single word is print
        System.out.println("Your first Name:"+name);
        Input.nextLine();
        System.out.println("Enter your full name :");
        String name_2 = Input.nextLine();
        System.out.println("Your full Name:"+name_2);

    }
}
