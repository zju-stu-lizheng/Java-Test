import java.util.Scanner;

public class T2 {
    public static boolean judge(int[][] a, int[][] b) {
        boolean flag = true;
        int i, j;
        for (i = 0; i < a.length; i++)
            for (j = 0; j < a[0].length; j++)
                if (a[i][j] != b[i][j]) {
                    flag = false;
                    break;
                }

        return flag;
    }

    public static void main(String[] args) {
        int ri, repeat;
        int a[][], b[][], i, j, n;
        Scanner in = new Scanner(System.in);
        repeat = in.nextInt();
        for (ri = 1; ri <= repeat; ri++) {
            n = in.nextInt();
            a = new int[n][n];
            b = new int[n][n];
            for (i = 0; i < n; i++)
                for (j = 0; j < n; j++)
                    a[i][j] = in.nextInt();
            for (i = 0; i < n; i++)
                for (j = 0; j < n; j++)
                    b[i][j] = in.nextInt();
            if (judge(a, b))
                System.out.println("Yes");
            else
                System.out.println("No");
        }
    }
    /*--------------------*/
}
