import java.util.*;

public class T6 {
    /**
     * 读入m,n（0<=m<=n），输出m和n之间的包含数字0的数据。
     * 
     * [输入]：
     * 2 (repeat=2)
     * 5 20 380 402
     * [输出]
     * 10,20,
     * 380,390,400,401,402,
     * 
     * @param args
     */
    public static void main(String[] args) {
        int ri, repeat, m, n, i, t;
        boolean f;
        Scanner in = new Scanner(System.in);
        repeat = in.nextInt();
        for (ri = 1; ri <= repeat; ri++) {
            m = in.nextInt();
            n = in.nextInt();
            for (i = m; i <= n; i++) {
                f = false;
                t = i;
                if (i == 0) {
                    System.out.print(i + ",");
                    continue;
                }
                while (t > 0) {
                    if (t % 10 == 0) {
                        f = true;
                    }
                    t /= 10;
                }
                if (f) {
                    System.out.print(i + ",");
                }
            }
            System.out.println();
        }
    }
}