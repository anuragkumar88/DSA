package basics;
// pattern like
//1234 1234 1234 1234
import java.util.*;
public class Pattern7 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("enter the row :");
        int row = input.nextInt();
        System.out.println("enter the column :");
        int column = input.nextInt();
        for (int i=1; i<=row ; i++){
            for (int j = 1;j<=column; j++){
                System.out.print(j);
            }
            System.out.println();
        }

    }
}