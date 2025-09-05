package basics;

import java.util.Scanner;

public class ArithmaticOperators {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("enter your first number X :");
        double x = input.nextDouble();
        System.out.println("enter your second number Y :");
        double y = input.nextDouble();
        double add = x + y ;
        System.out.println("The sum of the number :" +add);
        double subtract = x - y ;
        System.out.println("The subtract of the number :" +subtract);
        double multiply = x * y ;
        System.out.println("The multiply of the number :" +multiply);
        double division = x / y ;
        System.out.println("The division of the number :" +division);
        double modulus = x % y ;
        System.out.println("The modulus of the number :" +modulus);
// relational operators
        System.out.println(x==y);
        System.out.println(x!=y);
        System.out.println(x<=y);
        System.out.println(x>=y);
        System.out.println(x<y);
        System.out.println(x>y);
        System.out.println(x=y);

        // logical operators
        System.out.println("enter your first number :");
        double a = input.nextDouble();
        System.out.println("enter your second number:");
        double b = input.nextDouble();
        System.out.println("enter your third number : ");
        double c = input.nextDouble();
       //& operator
        System.out.println(a>b && b>c);
        System.out.println(a<b && b<c);
        System.out.println(a<b && b>c);
//      ||operator
        System.out.println(a>b || b>c);
        System.out.println(a<b || b<c);
        System.out.println(a<b || b>c);
        // ! operator
        System.out.println(!(a==b));
        System.out.println(!(b==c));
        System.out.println(!(c==a));





    }
}
