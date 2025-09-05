package basics;

import java.util.*;
public class AreaOfRectangleFunction {
    public static double areaofrec(double length,double breadth){
        return length*breadth;

    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("enter length :");
        double length = input.nextDouble();
        System.out.println("enter breadth");
        double breadth = input.nextDouble();
        double area = areaofrec(length,breadth);
        System.out.println("area of rectangle :"+area);
    }
}
