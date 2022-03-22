import java.util.Scanner;

public class T4 {
    public static void main(String[] args) {
        /**
         * calculate : 1-1/3+1/5-1/7+
         */
        int ri, repeat, i;
        int temp, flag;
        double eps, item, sum;
        Scanner in = new Scanner(System.in);
        repeat = in.nextInt();
        for (ri = 1; ri <= repeat; ri++) {
            eps = in.nextDouble();
            i = 1;
            item = 1.0f / (2 * i - 1);
            flag = 1;
            sum = 0.0f;
            while (item >= eps) {
                sum += flag * item;
                flag *= -1;
                i++;
                item = 1.0f / (2 * i - 1);
            }
            System.out.println((int) (sum * 10000 + 0.5) / 10000.);
        }
    }
}