package basics;
//pyramid by using number
//    1
//   123
//  12345
// 1234567


import java.util.*;
public class Pattern10 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("enter the row :");
        int row = input.nextInt();

        for (int i=1; i<=row ; i++){
            for (int j = 1;j<=row-i; j++){
                System.out.print(" ");
            }
            for(int k = 1; k<=2*i-1; k++){
                System.out.print(k);
            }
            System.out.println();
        }

    }
}
