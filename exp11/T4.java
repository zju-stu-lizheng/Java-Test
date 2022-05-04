import java.util.*;

public class T4 {
    public static void printTriangle(int n) {
        int i = 0, j = 0;
        for (i = n; i > 0; i--) {
            for (j = 0; j < i; j++)
                System.out.print("*");
            System.out.println("");
        }
    }

    public static void main(String[] args) {
        int ri, repeat, n;
        Scanner in = new Scanner(System.in);
        repeat = in.nextInt();
        for (ri = 1; ri <= repeat; ri++) {
            n = in.nextInt();
            printTriangle(n);
        }
    }
}