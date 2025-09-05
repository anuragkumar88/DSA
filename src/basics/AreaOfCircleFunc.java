package basics;

import java.util.*;

public class AreaOfCircleFunc {
public static double areaCircle(double rad){
    return Math.PI * rad*rad;
}
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("enter radius :");
        double rad = input.nextDouble();
        double area = areaCircle(rad);
        System.out.println("the area of circle :" +area);

        }





    }

