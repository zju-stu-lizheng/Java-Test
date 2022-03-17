import java.util.*;

public class T3 {
    public static void main(String[] args) {
        /**
         * 读入1 个正整数 n(n<=50)，计算并输出1+1/3+1/5+...的前n项和 。
         */
        int ri, repeat;
        int i, n;
        double sum;
        Scanner in = new Scanner(System.in);
        repeat = in.nextInt();
        for (ri = 1; ri <= repeat; ri++) {
            n = in.nextInt();
            sum = 0.0;
            for (i = 1; i <= n; i++) {
                sum += 1.0 / (2 * i - 1);
            }
            System.out.println(sum);
        }
    }
}
