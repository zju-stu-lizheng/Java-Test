import java.util.Scanner;

public class T4 {
    public static void main(String args[]) {
        int ri, repeat;
        int i, m, n;
        long f;
        Scanner in = new Scanner(System.in);
        repeat = in.nextInt();
        for (ri = 1; ri <= repeat; ri++) {
            m = in.nextInt();
            n = in.nextInt();
            for (i = 1; fib(i) <= n; i++) {
                if (fib(i) >= m)
                    System.out.print(fib(i) + " ");
            }

            System.out.println();
        }
    }

    public static int fib(int n) {
        int a = 1, b = 1;
        int i;
        int temp;
        if (n < 3) {
            return a;
        }
        for (i = 3; i <= n; i++) {
            temp = a;
            a = b;
            b = b + temp;
        }
        return b;
    }
}