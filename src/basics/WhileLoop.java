package basics;//wap for print the sum of n natural  number where n is given in user input


import java.util.*;

public class WhileLoop {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int sum = 0;
        int num = 1;
        while (num<=n){
            System.out.println(num);
            sum = sum +num;
            num++;

        }
        System.out.println(sum);

    }

}
