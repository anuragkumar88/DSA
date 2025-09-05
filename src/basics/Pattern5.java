package basics;//triangle pattern Pyramid type


import java.util.*;
public class Pattern5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("enter the row :");
        int row = input.nextInt();

        for (int i=1; i<=row ; i++){
            for (int j = 1;j<=row-i; j++){
                System.out.print(" ");
            }
            for(int k = 1; k<=2*i-1; k++){
                System.out.print("*");
            }
            System.out.println();
        }

    }
}
