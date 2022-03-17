import java.util.Scanner;

public class Test30004 {
    public static void main(String[] args) {
        int ri, repeat;
        int x, y;
        Scanner in = new Scanner(System.in);
        repeat = in.nextInt();
        for (ri = 1; ri <= repeat; ri++) {
            x = in.nextInt();
            if (x > 0) {
                y = 1;
            } else if (x == 0) {
                y = 0;
            } else {
                y = -1;
            }
            System.out.println(y);
        }
    }
}