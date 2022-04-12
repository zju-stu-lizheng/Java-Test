import java.util.Scanner;

public class T6 {
    public static void main(String args[]) {
        int ri, repeat;
        long n, res;
        Scanner in = new Scanner(System.in);
        repeat = in.nextInt();
        for (ri = 1; ri <= repeat; ri++) {
            n = in.nextInt();
            res = reverse(n);
            System.out.println(res);
        }
    }

    public static long reverse(long num) {
        long _sum = 0;
        long digit = 0;
        long flag = 1;
        if (num < 0) {
            num = -num;
            flag = -1;
        }
        while (num > 0) {
            digit = num % 10;
            num /= 10;
            _sum = _sum * 10 + digit;
        }
        return _sum * flag;
    }
}