
import java.util.Scanner;

public class T7 {
    public static void main(String[] args) {
        int ri, repeat;
        int i, max, n, x;
        Scanner in = new Scanner(System.in);
        repeat = in.nextInt();
        for (ri = 1; ri <= repeat; ri++) {
            n = in.nextInt();
            max = 0;
            for (i = 0; i < n; i++) {
                x = in.nextInt();
                if (x > max) {
                    max = x;
                }
            }
            System.out.println(max);
        }
    }
}