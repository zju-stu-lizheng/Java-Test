import java.util.*;
import java.math.*;

public class T2 {
    public static void main(String[] args) {
        int ri, repeat, m, n, i, j, flag;
        double s;
        Scanner in = new Scanner(System.in);
        repeat = in.nextInt();
        for (ri = 1; ri <= repeat; ri++) {
            m = in.nextInt();
            n = in.nextInt();
            flag = 1;
            s = 0.0f;
            for (i = m; i <= n; i++) {
                flag = 1;
                for (j = 0; j < i; j++) {
                    flag *= -1;
                }
                s = s + (double) flag * ((double) 1.0 / (double) i);
                // System.out.println("s=" + Math.round(s * 1000) / 1000.);
            }
            System.out.println("s=" + Math.round(s * 1000) / 1000.);
        }
    }
}
