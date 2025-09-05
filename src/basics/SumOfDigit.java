package basics;

import java.util.*;

public class SumOfDigit {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("enter The number :");
        int num = input.nextInt();
        int sum =0;
        while (num>0){
            sum+= num%10;
            num = num/10;
        }
        System.out.println(+sum);
    }
}
