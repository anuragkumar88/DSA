package basics;

import java.util.*;
public class SimpleInterestFunction {
    public static double simpleInterest(double p, double r, double t){
        return p*r*t /100;

    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("enter p");
    double p = input.nextDouble();
        System.out.println("enter r");
        double r = input.nextDouble();
        System.out.println("enter t");
        double t = input.nextDouble();
        double si = simpleInterest(p,r,t);
        System.out.println("your si is :"+ si);
    }
}
