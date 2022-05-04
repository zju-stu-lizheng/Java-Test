import java.util.Scanner;

public class T7 {
    public static void main(String[] args) {
        int ri, repeat;
        int i, j, k, row, col, n, a[][];
        boolean flag, quanju;
        Scanner in = new Scanner(System.in);
        repeat = in.nextInt();
        for (ri = 1; ri <= repeat; ri++) {
            n = in.nextInt();
            a = new int[n][n];
            for (i = 0; i < n; i++)
                for (j = 0; j < n; j++)
                    a[i][j] = in.nextInt();
            quanju = false;
            col = row = 0;
            for (i = 0; i < n; i++) {
                for (j = 0; j < n; j++) {
                    flag = true;
                    // a[i][j] >= a[i][k]
                    for (k = 0; k < n; k++) {
                        if (a[i][j] < a[i][k]) {
                            flag = false;
                            // System.out.println("a[" + i + "][" + j + "] < " + "a[" + i + "][" + k + "]
                            // ");
                            break;
                        }
                    }
                    // a[i][j] <= a[k][j]
                    for (k = 0; k < n; k++) {
                        if (a[i][j] > a[k][j]) {
                            // System.out.println("a[" + i + "][" + j + "] > " + "a[" + k + "][" + j + "]
                            // ");
                            flag = false;
                            break;
                        }
                    }
                    if (flag) {
                        quanju = true;
                        row = i;
                        col = j;
                    }
                }
            }
            if (quanju)
                System.out.println("a[" + row + "][" + col + "]=" + a[row][col]);
            else
                System.out.println("NO");
        }
    }
}