
import java.util.Scanner;

public class T6 {
    public static void main(String[] args) {
        int ri, repeat;
        int i, index, n, a[];
        Scanner in = new Scanner(System.in);
        repeat = in.nextInt();
        for (ri = 1; ri <= repeat; ri++) {
            n = in.nextInt();
            a = new int[n];
            int _max = 0;
            index = 0;
            for (i = 0; i < n; i++) {
                a[i] = in.nextInt();
                if (a[i] > _max) {
                    index = i;
                    _max = a[i];
                }
            }
            System.out.println("max=" + a[index] + ",index=" + index);
        }
    }
}
