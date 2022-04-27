import java.util.Scanner;

public class T6 {
    public static void main(String[] args) {
        int ri, repeat;
        int a[][], i, j, m, n;
        Scanner in = new Scanner(System.in);
        repeat = in.nextInt();
        for (ri = 1; ri <= repeat; ri++) {
            m = in.nextInt();
            n = in.nextInt();
            a = new int[m][n];
            for (i = 0; i < m; i++)
                for (j = 0; j < n; j++)
                    a[i][j] = in.nextInt();

            System.out.println("max=" + max(a, m, n));
        }
    }

    public static int max(int[][] a, int m, int n) {
        int max = a[0][0];
        int i, j;
        for (i = 0; i < m; i++)
            for (j = 0; j < n; j++)
                if (a[i][j] > max)
                    max = a[i][j];
        return max;
    }
}