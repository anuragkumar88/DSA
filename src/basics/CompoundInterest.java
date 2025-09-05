package basics;

import java.util.Scanner;
public class CompoundInterest {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter principal Amount :");
        double amt = input.nextDouble();
        System.out.println("Enter Interest Rate:");
        double int_rate = input.nextDouble();
        System.out.println("Enter number of interest of Ci per year :");
        double n = input.nextDouble();
        System.out.println("enter Time years :");
        double t = input.nextDouble();
        double a = amt*(1+int_rate/n)*n*t;
        System.out.println("your compound interest amount is :" + a);

    }
}