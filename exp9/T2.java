import java.util.*;

public class T2 {
    public static void main(String[] args) {
        int ri, repeat, n, s, quantity;
        Scanner in = new Scanner(System.in);
        repeat = in.nextInt();
        for (ri = 1; ri <= repeat; ri++) {
            n = in.nextInt();
            s = 0;
            quantity = 2;
            while (quantity <= n) {
                s += quantity;
                quantity *= 2;
            }
            System.out.println("apple counts=" + s);
        }
    }
}