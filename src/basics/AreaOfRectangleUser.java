package basics;

import java.util.Scanner;

public class AreaOfRectangleUser {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the value of lengh: ");
        double length = input.nextDouble();
        System.out.println("Enter the value of bredth: ");
        double bredth =input.nextDouble();
        double area = length * bredth ;
        System.out.println("Area of rectange:"+area);


    }
}
