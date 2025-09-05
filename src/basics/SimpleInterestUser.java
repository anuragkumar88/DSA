package basics;

import java.util.Scanner;

public class SimpleInterestUser {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the value of Amount: ");
        int amount= input.nextInt();
        System.out.println("Enter the value of Time: ");
        int time = input.nextInt();
        System.out.println("Enter the value of Rate: ");
        double rate = input.nextDouble();
        double si = amount*time*rate / 100;
        System.out.println("The si of number is :"+si);

    }
}
