import java.util.*;

public class T5 {
    /**
     * 千位分隔符
     * [输入]
     * 2
     * 1233542 2432
     * [输出]
     * 1,233,542
     * 2,432
     * 
     * @param args
     */
    public static void main(String[] args) {
        int ri, repeat;
        long n, t, m;
        long digit, pow;
        Scanner in = new Scanner(System.in);
        repeat = in.nextInt();
        for (ri = 1; ri <= repeat; ri++) {
            n = in.nextLong();
            // divide 1000
            t = n;
            digit = 1;
            while (t > 0) {
                t /= 1000;
                if (t == 0) {
                    break;
                }
                digit *= 1000;
            }
            t = n;
            while (digit > 0) {
                m = t / digit;
                t = t % digit;
                digit /= 1000;
                if (digit == 0) {
                    System.out.println(m);
                } else {
                    System.out.print(m + ",");
                }
            }
        }
    }
}