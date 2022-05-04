import java.util.*;

public class T5 {
    public static void main(String[] args) {
        int ri, repeat, n, m, min, count, i;
        Scanner in = new Scanner(System.in);
        repeat = in.nextInt();
        for (ri = 1; ri <= repeat; ri++) {
            m = in.nextInt();
            min = m;
            count = 0;
            boolean isPrime = true;
            while (m != 999) {
                isPrime = true;
                if (m < min)
                    min = m;
                if (m == 2)
                    isPrime = true;
                else if (m <= 1)
                    isPrime = false;
                else {
                    for (i = 2; i * i <= m; i++) {
                        if (m % i == 0) {
                            isPrime = false;
                            break;
                        }
                    }
                }
                if (isPrime)
                    count++;
                m = in.nextInt();
            }
            System.out.println("素数个数=" + count);
            System.out.println("最小值=" + min);
        }
    }
}