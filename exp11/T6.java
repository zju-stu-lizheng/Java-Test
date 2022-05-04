import java.util.Scanner;

public class T6 {
    public static void main(String args[]) {
        int ri, repeat;
        int i, m, n;
        Scanner in = new Scanner(System.in);
        repeat = in.nextInt();
        for (ri = 1; ri <= repeat; ri++) {
            m = in.nextInt();
            n = in.nextInt();
            for (i = m; i <= n; i++) {
                // System.out.println(i + " factSum:" + factSum(i) + " ");
                if (i == factSum(i)) {
                    System.out.print(i + " ");
                }
            }
            System.out.println();
        }
    }

    public static int factSum(int n) {
        int i = 0;
        int nn = n;
        int sum = 1;
        for (i = 2; i < nn; i++) {
            if (n % i == 0) {
                sum += i;
            }
            if (n == 1) {
                break;
            }
        }
        return sum;
    }
}