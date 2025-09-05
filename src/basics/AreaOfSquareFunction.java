package basics;

import java.util.*;
public class AreaOfSquareFunction {
    public static double areaOfSquare(double side){
        return side*side;

    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("enter side :");
        double side = input.nextDouble();
        double area =areaOfSquare(side);
        System.out.println("the area of square :" + area);
    }
}
