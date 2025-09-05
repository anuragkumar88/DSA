package basics;//rectangular pattern contains numbers



import java.util.*;
public class Pattern6 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("enter the row :");
        int row = input.nextInt();
        for (int i = 1;i<= row; i++){
            for (int j = i ; j <= row ; j++){
                System.out.print(j);

            }
            for (int k= 1; k<= i - 1 ; k++){
                System.out.print(k);
            }
            System.out.println();
        }

    }
}