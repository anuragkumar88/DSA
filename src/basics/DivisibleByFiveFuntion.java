package basics;

import java.util.*;
public class DivisibleByFiveFuntion {
    static void divisible(int num){
        if (num%5==0){
            System.out.println("the number is divisible by 5 ");
        }
        else {
            System.out.println("not divisible by 5");
        }
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("enter the number :");
        int a = input.nextInt();
        divisible(a);
    }

}
