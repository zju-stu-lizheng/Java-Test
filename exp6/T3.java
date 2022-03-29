import java.util.Scanner;

public class T3 {
    /**
     * 输入2 个正整数m和n(1<=m,n<=1000)，输出m 和n之间所有满足各位数字的立方和等于它本身的数。
     * 
     * @param args
     */
    public static void main(String[] args) {
        int ri, repeat;
        int i, digit, m, n, number, sum;
        Scanner in = new Scanner(System.in);
        repeat = in.nextInt();
        for (ri = 1; ri <= repeat; ri++) {
            m = in.nextInt();
            n = in.nextInt();
            for (i = m; i <= n; i++) {
                number = i;
                sum = 0;
                while (number > 0) {
                    digit = (number % 10);
                    sum += digit * digit * digit;
                    number /= 10;
                }
                if (sum == i) {
                    System.out.println(i);
                }
            }
        }
    }
}