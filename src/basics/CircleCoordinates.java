package basics;//Given the coordinates (x, y) of the center of a circle and its radius, write a program that determines whether a given point (x1, y1) lies:
//
//Inside the circle
//
//On the circle, or
//
//Outside the circle

import java.util.*;

public class CircleCoordinates {
    public static String distanceQ(double x, double y, double r, double x1, double y1) {
        double distance = Math.sqrt(Math.pow(x1 - x, 2) + Math.pow(y1 - y, 2));

        if (distance < r) {
            return "The point lies inside the circle.";
        } else if (distance == r) {
            return "The point lies on the circle.";
        } else {
            return "The point lies outside the circle.";
        }
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the x-coordinate of the circle center: ");
        double x = input.nextDouble();
        System.out.print("Enter the y-coordinate of the circle center: ");
        double y = input.nextDouble();
        System.out.print("Enter the radius of the circle: ");
        double r = input.nextDouble();

        System.out.print("Enter the x-coordinate of the point: ");
        double x1 = input.nextDouble();
        System.out.print("Enter the y-coordinate of the point: ");
        double y1 = input.nextDouble();


        String result = distanceQ(x, y, r, x1, y1);
        System.out.println(result);

        input.close();
    }
}
