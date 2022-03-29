import java.util.*;

public class T2 {
    /**
     * 求最大公因数和最小公倍数
     * 
     * @param args
     */
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int gcd, lcm, m, n, r, a, b;
        int repeat, ri;
        repeat = in.nextInt();
        for (ri = 1; ri <= repeat; ri++) {
            m = in.nextInt();
            n = in.nextInt();
            if (m <= 0 || n <= 0)
                System.out.println("m <= 0 or n <= 0");
            else {
                a = m;
                b = n;
                while (b > 0) {
                    r = a % b;
                    a = b;
                    b = r;
                }
                gcd = a;
                lcm = m * n / gcd;
                System.out.println("the least common multiple:" + lcm + ", the greatest common divisor:" + gcd);
            }
        }
    }
}