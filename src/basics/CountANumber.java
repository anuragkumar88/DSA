package basics;

import java.util.*;

public class CountANumber {
    public static void main(String[] args) {
        Scanner input =new Scanner(System.in);
        System.out.println("enter the number :");
        int num = input.nextInt();
        int count =0;
        while (num>0){
            num /=10;
            count ++;

        }
        System.out.println("number of digits are :"+count);
    }
}
