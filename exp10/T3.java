import java.util.Scanner;

public class T3 {
    public static void main(String[] args) {
        int ri, repeat;
        int a[][], i, j, n;
        boolean flag;
        Scanner in = new Scanner(System.in);
        repeat = in.nextInt();
        for (ri = 1; ri <= repeat; ri++) {
            n = in.nextInt();
            a = new int[n][n];
            for (i = 0; i < n; i++)
                for (j = 0; j < n; j++)
                    a[i][j] = in.nextInt();
            flag = true;
            for (i = 0; i < n; i++)
                for (j = 0; j < i; j++)
                    if (a[i][j] != 0) {
                        flag = false;
                        break;
                    }

            if (flag)
                System.out.println("YES");
            else
                System.out.println("NO");
        }
    }
}