import java.util.Scanner;

public class T8 {
    public static void main(String[] args) {
        /**
         * 2/1+3/2+5/3+8/5+......
         * Fibonacci number
         */
        int ri, repeat;
        int i, n;
        float a, b, s, t, tmp;
        Scanner in = new Scanner(System.in);
        repeat = in.nextInt();
        for (ri = 1; ri <= repeat; ri++) {
            n = in.nextInt();
            a = 1;
            b = 2;
            s = 0.0f;
            for (i = 1; i <= n; i++) {
                if (i > 1) {
                    tmp = a + b;
                    a = b;
                    b = tmp;
                }
                t = b / a;
                s += t;
            }
            System.out.println((int) (s * 10000 + .5) / 10000.);
        }
    }
}