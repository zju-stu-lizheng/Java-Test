import java.util.Scanner;

public class T1 {
    /**
     * output the number of digits and sum of digits
     * 
     * @param args
     */
    public static void main(String[] args) {
        int ri, repeat;
        int number, sum, n;
        Scanner in = new Scanner(System.in);
        repeat = in.nextInt();
        for (ri = 1; ri <= repeat; ri++) {
            n = in.nextInt();
            sum = 0;
            number = 0;
            if (n == 0) {
                number = 1;
                sum = 0;
            } else {
                if (n < 0) {
                    n = -n;
                }
                while (n > 0) {
                    number++;
                    sum += n % 10;
                    n /= 10;
                }
            }

            System.out.println("number=" + number + ", sum=" + sum);
        }
    }
}