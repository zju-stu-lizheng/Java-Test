import java.util.Scanner;

public class T4 {
    public static void main(String args[]) {
        int ri, repeat;
        int count;
        long n;
        Scanner in = new Scanner(System.in);
        repeat = in.nextInt();
        for (ri = 1; ri <= repeat; ri++) {
            n = in.nextInt();
            count = countdigit(n, 2);
            System.out.println("count=" + count);
        }
    }

    public static int countdigit(long number, int digit) {
        int i = 0;
        if (number < 0) {
            number = -number;
        }
        do {
            if (number % 10 == digit)
                i++;
            number /= 10;
        } while (number > 0);
        return i;
    }
}