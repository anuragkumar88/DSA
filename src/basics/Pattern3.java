package basics;//triangle pattern


import java.util.*;
public class Pattern3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("enter the row :");
        int row = input.nextInt();

        for (int i=1; i<=row ; i++){
            for (int j = 1;j<=i; j++){
                System.out.print("*");
            }
            System.out.println();
        }

    }
}
