import java.util.Scanner;

class T3 {
    public static void main(String[] args) {
        int ri, repeat;
        int i, n;
        float sum;
        Scanner in = new Scanner(System.in);
        repeat = in.nextInt();
        for (ri = 1; ri <= repeat; ri++) {
            n = in.nextInt();
            sum = 0.0f;
            for (i = 1; i <= n; i++) {
                sum += 1.0 / i;
            }
            System.out.println((int) (sum * 1000 + 0.5) / 1000.);
        }
    }
}