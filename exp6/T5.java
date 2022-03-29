import java.util.*;

public class T5 {
    /**
     * 假定第一天买2个苹果，从第二天开始，每天买前一天的2倍数量再加1个（即从第一天开始，每天购苹果2、5、11、23、……），
     * 直至当天购买的苹果个数达到不超过n（2<=n<=1000000）的最大值。编写程序，输入一个正整数n，求购买苹果的天数。
     * 
     * @param args
     */
    public static void main(String[] args) {
        int ri, repeat, n, days, quantity;
        Scanner in = new Scanner(System.in);
        repeat = in.nextInt();
        for (ri = 1; ri <= repeat; ri++) {
            n = in.nextInt();
            quantity = 2;
            days = 0;
            while (quantity <= n) {
                quantity = 2 * quantity + 1;
                days += 1;
            }
            System.out.println("days=" + days);
        }
    }
}
