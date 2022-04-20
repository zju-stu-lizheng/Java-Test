import java.util.*;

public class T3 {
    /*---------*/
    public static void main(String[] args) {
        int ri, repeat, n;
        Scanner in = new Scanner(System.in);
        repeat = in.nextInt();
        for (ri = 1; ri <= repeat; ri++) {
            n = in.nextInt();
            printTriangle(n);
        }
    }

    public static void printTriangle(int n) {
        int i, j;
        for (i = 1; i <= n; i++) {
            for (j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println("");
        }
    }
}