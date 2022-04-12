import java.util.Scanner;

public class T1 {
    public static void main(String[] args) {
        int ri, repeat;
        int i, n;
        double s;
        Scanner in = new Scanner(System.in);
        repeat = in.nextInt();
        for (ri = 1; ri <= repeat; ri++) {
            n = in.nextInt();
            s = 0.0;
            for (i = 1; i <= n; i++) {
                s += 1.0 / fact(i);
            }
            System.out.println((long) (s * 10000 + 0.5) / 10000.);
        }
    }

    public static int fact(int n) {
        int i = 1;
        int _fact = 1;
        for (i = 1; i <= n; i++) {
            _fact *= i;
        }
        return _fact;
    }
}