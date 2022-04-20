import java.util.Scanner;

public class T1 {
    public static void main(String args[]) {
        int ri, repeat;
        int i, n;
        float s, t;
        Scanner in = new Scanner(System.in);
        repeat = in.nextInt();
        for (ri = 1; ri <= repeat; ri++) {
            n = in.nextInt();
            s = 0;
            for (i = 1; i <= n; i++) {
                s += fn(i);
            }
            System.out.println((int) (s * 10000 + 0.5) / 10000.);
        }
    }

    public static double fn(int n) {
        int i = 1;
        double t = 1;
        for (i = 1; i <= n; i++) {
            t *= i;
        }
        t = 1.0 / t;
        return t;
    }
}