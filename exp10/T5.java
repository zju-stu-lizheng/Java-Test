import java.util.Scanner;

public class T5 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a[][] = new int[3][3];
        int iter, i, j, n, temp;
        n = in.nextInt();
        for (iter = 0; iter < n; iter++) {
            for (i = 0; i < 3; i++) {
                for (j = 0; j < 3; j++) {
                    a[i][j] = in.nextInt();
                }
            }
            for (j = 0; j < 3; j++) {
                temp = a[0][j];
                a[0][j] = a[2][j];
                a[2][j] = temp;
            }
            for (i = 0; i < 3; i++) {
                for (j = 0; j < 3; j++) {
                    System.out.print(a[i][j] + "\t");
                }
                System.out.println("");
            }
        }
    }
}
