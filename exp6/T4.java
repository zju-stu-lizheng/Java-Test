
import java.util.Scanner;

public class T4 {
    /**
     * 输入2 个正整数m和n(1<=m,n<=500)，统计并输出m 和n之间的素数的个数以及这些素数的和。
     * 
     * @param args
     */
    public static void main(String args[]) {
        int ri, repeat;
        int count, i, j, k, m, n, sum;
        Scanner in = new Scanner(System.in);
        repeat = in.nextInt();
        for (ri = 1; ri <= repeat; ri++) {
            m = in.nextInt();
            n = in.nextInt();
            count = 0;
            sum = 0;
            for (i = m; i <= n; i++) {
                boolean isPrime = true;
                if (i == 1) {
                    continue;
                }
                for (j = 2; j < i; j++) {
                    if (i % j == 0) {
                        isPrime = false;
                        break;
                    }
                }
                if (isPrime) {
                    count++;
                    sum += i;
                }
            }
            System.out.println("count=" + count + ", sum=" + sum);
        }
    }
}
