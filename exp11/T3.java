import java.util.*;

public class T3 {
    public static void main(String[] args) {
        int ri, repeat, m, n, i, j, flag, count, un, sum;
        double average;
        Scanner in = new Scanner(System.in);
        repeat = in.nextInt();
        count = 0;
        for (ri = 1; ri <= repeat; ri++) {
            m = in.nextInt();
            count = 0;
            sum = 0;
            un = 0;
            while (m != -1) {
                if (m < 60)
                    un++;
                sum += m;
                count++;
                m = in.nextInt();
            }
            average = (double) sum / count;
            System.out.println("average=" + Math.round(average * 100) / 100.);
            System.out.println("count=" + un);
            count++;
        }
    }

}
