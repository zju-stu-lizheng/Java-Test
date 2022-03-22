import java.util.Scanner;

public class T3 {
    public static void main(String[] args) {
        /**
         * calculate : 1-1/2+1/3-1/4+
         */
        int ri, repeat;
        int i, n, flag;
        float sum;
        Scanner in = new Scanner(System.in);
        repeat = in.nextInt();
        for (ri = 1; ri <= repeat; ri++) {
            n = in.nextInt();
            sum = 0.0f;
            flag = 1;
            for (i = 1; i <= n; i++) {
                sum = sum + 1.0f / i * flag;
                flag = -flag;
            }
            System.out.println((long) (sum * 10000 + 0.5) / 10000.);
        }
    }
}