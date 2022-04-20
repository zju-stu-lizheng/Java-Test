import java.util.Scanner;

public class T7 {
    public static void main(String[] args) {
        int ri, repeat;
        int i, n, temp, a[];
        Scanner in = new Scanner(System.in);
        repeat = in.nextInt();
        for (ri = 1; ri <= repeat; ri++) {
            n = in.nextInt();
            a = new int[n];
            for (i = 0; i < n; i++)
                a[i] = in.nextInt();
            for (i = 0; i < n / 2; i++) {
                temp = a[i];
                a[i] = a[n - i - 1];
                a[n - i - 1] = temp;
            }
            for (i = 0; i < n; i++)
                System.out.print(a[i] + " ");
            System.out.println();
        }
    }
}