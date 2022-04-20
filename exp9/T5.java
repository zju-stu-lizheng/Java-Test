import java.util.Scanner;

public class T5 {
    public static void main(String[] args) {
        int ri, repeat;
        int i, n, sum, a[];
        float aver;
        Scanner in = new Scanner(System.in);
        repeat = in.nextInt();
        for (ri = 1; ri <= repeat; ri++) {
            n = in.nextInt();
            a = new int[n];
            sum = 0;
            for (i = 0; i < n; i++) {
                a[i] = in.nextInt();
                sum += a[i];
            }
            aver = (float) sum / n;
            /*---------*/
            System.out.println("aver=" + aver);
        }
    }
}