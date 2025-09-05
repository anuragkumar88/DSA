package basics;

import java.util.*;
public class Pattern8 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("enter the row :");
        int row = input.nextInt();
        System.out.println("enter the column :");
        int column = input.nextInt();
        for (int i=1; i<=row ; i++){
            for (int j = 1;j<=column; j++){
                if ((i+j)%2 == 0){
                    System.out.print(1);

                }else{
                    System.out.print(2);
                }
            }
            System.out.println();
        }

    }
}
