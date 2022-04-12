import java.util.Scanner;

public class T3 {
    public static void main(String args[]) {
        int ri, repeat, n;
        boolean flag;
        Scanner in = new Scanner(System.in);
        repeat = in.nextInt();
        for (ri = 1; ri <= repeat; ri++) {
            n = in.nextInt();
            flag = prime(n);
            if (flag)
                System.out.println("YES");
            else
                System.out.println("NO");
        }
    }

    public static boolean prime(int m) {
        int i = 1;
        if (m == 1) {
            return false;
        } else {
            for (i = 2; i <= Math.sqrt(m); i++) {
                if (m % i == 0) {
                    return false;
                }
            }
        }
        return true;
    }
}