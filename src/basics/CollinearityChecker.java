package basics;//Ques: Given three points (x1, y1), (x2, y2) and (x3, y3), write a program to check if all the three points fall on one
// straight line.






import java.util.*;


public class CollinearityChecker {
    public static boolean collinear(int x1,int y1, int x2,int y2,int x3,int y3){
        int area = x1 * (y2 - y3) + x2 * (y3 - y1) + x3 * (y1 - y2);
        return area == 0;


    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("enter the value of X1 :");
        int x1 = input.nextInt();
        System.out.println("enter the value of Y1 :");
        int y1 = input.nextInt();
        System.out.println("enter the value of X2:");
        int x2= input.nextInt();
        System.out.println("enter the value of Y2:");
        int y2 = input.nextInt();
        System.out.println("enter the value of X:");
        int x3 = input.nextInt();
        System.out.println("enter the value of Y3 :");
        int y3 = input.nextInt();
        if (collinear(x1, y1, x2, y2, x3, y3)) {
            System.out.println("The points lie on the same straight line.");
        } else {
            System.out.println("The points do NOT lie on the same straight line.");
        }


    }
}
