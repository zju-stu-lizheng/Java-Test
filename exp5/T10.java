import java.util.Scanner;

public class T10 {
    public static void main(String args[]) {
        int ri, repeat;
        int i, m, n;
        boolean flag;
        Scanner in = new Scanner(System.in);
        repeat = in.nextInt();
        for (ri = 1; ri <= repeat; ri++) {
            m = in.nextInt();
            flag = true;
            if (m == 1) {
                flag = false;
            }
            for (i = 2; i < m; i++) {
                if (m % i == 0) {
                    flag = false;
                    break;
                }
            }
            if (flag)
                System.out.println("YES");
            else
                System.out.println("NO");
        }
    }
}