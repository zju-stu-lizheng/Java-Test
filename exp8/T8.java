
import java.util.Scanner;

public class T8 {
    public static void main(String args[]) {
        int ri, repeat;
        int a, b, c, maximun;
        Scanner in = new Scanner(System.in);
        repeat = in.nextInt();
        for (ri = 1; ri <= repeat; ri++) {
            a = in.nextInt();
            b = in.nextInt();
            c = in.nextInt();
            maximun = max(a, b, c);
            System.out.println("max(" + a + "," + b + "," + c + ")=" + maximun);
        }
    }

    public static int max(int a, int b, int c) {
        int max = a;
        if (b > a) {
            max = b;
        }
        if (c > max) {
            max = c;
        }
        return max;
    }
}