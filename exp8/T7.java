import java.util.Scanner;

public class T7 {
    public static void main(String args[]) {
        int ri, repeat;
        int i, n;
        Scanner in = new Scanner(System.in);
        repeat = in.nextInt();
        for (ri = 1; ri <= repeat; ri++) {
            n = in.nextInt();
            System.out.print(dectobin(n));
            System.out.println();
        }
    }

    public static StringBuffer dectobin(int n) {
        StringBuffer b = new StringBuffer("");
        Integer digit = 0;
        if (n == 0) {
            return new StringBuffer("0");
        }
        while (n > 0) {
            digit = n % 2;
            b = b.append(digit);
            n /= 2;
        }
        // System.out.println(b);
        b = b.reverse();

        return b;
    }
}