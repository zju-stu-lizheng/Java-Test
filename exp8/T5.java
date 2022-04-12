import java.util.Scanner;

public class T5 {
    public static void main(String args[]) {
        int ri, repeat;
        int i, m, n;
        Scanner in = new Scanner(System.in);
        repeat = in.nextInt();
        for (ri = 1; ri <= repeat; ri++) {
            m = in.nextInt();
            n = in.nextInt();
            for (i = m; i <= n; i++) {
                if (is(i))
                    System.out.print(i + " ");
            }
            System.out.println();
        }
    }

    public static boolean is(int number) {
        int _sum = 0;
        int digit = 0;
        int copy_num = number;
        while (number > 0) {
            digit = number % 10;
            number /= 10;
            _sum += digit * digit * digit;
        }
        return (_sum == copy_num);
    }
}