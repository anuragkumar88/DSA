package basics;

import java.util.*;

public class LeapYearFunction {
    static void leapYear(int num){
        if  (num % 4== 0){
            System.out.println("Your year is leap year");
        }
        else {
            System.out.println("not leap year");
        }
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("enter the year : ");
        int num = input.nextInt();
        leapYear(num);
    }
}
