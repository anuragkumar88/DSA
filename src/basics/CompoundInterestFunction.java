package basics;

import java.util.*;
public class CompoundInterestFunction {
public static double compoundInt(double p ,double r,double n,double t){
    return p *(1+r/n)*n*t;
}

    public static void main(String[] args) {
        Scanner input =new Scanner(System.in);
        System.out.println("enter principal amount");
        double p = input.nextDouble();
        System.out.println("enter principal rate");
        double r = input.nextDouble();
        System.out.println("enter n");
        double n = input.nextDouble();
        System.out.println("enter time");
        double t = input.nextDouble();
        double amount = compoundInt(p,r,n,t);
        System.out.println("your ci is :" + amount);
    }

}
