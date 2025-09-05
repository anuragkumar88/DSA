package basics;//Ques: If cost price and selling price of an item is input through the keyboard,
// write a program to determine whether the seller has made profit or incurred loss.
// Also determine how much profit he made or loss he incurred.


import java.util.*;

public class ProfitLossCalculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter Cost Price :");
        int cp = input.nextInt();
        System.out.println("Enter Selling Price :");
        int sp = input.nextInt();
        if (sp>cp){
            System.out.println(" profit ");
            int profit = sp-cp;
            System.out.println(" your profit is : "+ profit);
        }
        else {
            System.out.println(" Loss ");
            int loss = sp- cp ;
            System.out.println(" Your loss is : " + loss);
        }

    }


}
