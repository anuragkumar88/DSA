package basics;

import java.util.*;
public class ReversingANumber {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int num= input.nextInt();
        int reverse =0;
        System.out.println("Original number"+num);
        while(num>0){
            int digit = num%10;
            reverse=reverse*10+digit;
            num=num/10;

        }
        System.out.println("reversed"+reverse);

    }}
