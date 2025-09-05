package basics;//wap for print the sum of n natural  number where n is given in user input


import java.util.*;

public class ForLoop {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("enter the number n :");
        int n = input.nextInt();
        for (int num = 1; num <= n; num++) {
            System.out.println(num);
        }
    }}
