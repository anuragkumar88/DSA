package basics;

import java.util.*;
public class AbsoluteValueFunctionConvertor {
    static void absolute(int n){
        if (n>0){
            System.out.println("your Value is absolute");

        }
        else {
           int num = n*-1;
            System.out.println("your value as absolute is : " +num);
        }
    }
// this
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("enter your number :");
        int n = input.nextInt();
        absolute(n);
    }
}
