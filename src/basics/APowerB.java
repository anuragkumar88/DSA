package basics;

import java.util.*;
public class APowerB {
    public static void main(String[] args) {
        Scanner Input=new Scanner(System.in);
        System.out.println("enter a");
        int a= Input.nextInt();
        System.out.println("enter b");
        int b = Input.nextInt();
        int ans = 1;
        for (int i=1;i<=b;i++){
            ans=ans*a;
        }
        System.out.println("enter ans "+ans);

    }
}
