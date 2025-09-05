package basics;

public class SumOfSeries {
    public static void main(String[] args) {
        System.out.println(sumOfSeries(5));
    }
    public static int sumOfSeries(int n) {
        int ans = 0;
        for (int i = 0; i <= n; i++) {
            if (i % 2 == 0) {
                ans = ans - i;
            }
            else {
                ans = ans + i;
            }
        }
        return ans;
    }
}