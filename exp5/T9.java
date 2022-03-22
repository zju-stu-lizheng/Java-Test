import java.util.Scanner;

public class T9 {
    public static void main(String args[]) {
        /**
         * calculate a+aa+aaa+aa...a
         */
        int ri, repeat;
        int i, n, a, sn, tn;
        Scanner in = new Scanner(System.in);
        repeat = in.nextInt();
        for (ri = 1; ri <= repeat; ri++) {
            a = in.nextInt();
            n = in.nextInt();
            tn = 0;
            sn = 0;
            for (i = 1; i <= n; i++) {
                tn = tn * 10 + a;
                sn += tn;
            }
            System.out.println(sn);
        }
    }
}
