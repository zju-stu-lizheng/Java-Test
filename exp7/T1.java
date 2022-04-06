import java.util.Scanner;

class T1 {
    /**
     * y = 1/x,保留两位小数
     *
     * @param args
     */
    public static void main(String args[]) {
        int repeat, ri, x;
        double y;
        Scanner in = new Scanner(System.in);
        repeat = in.nextInt();
        for (ri = 1; ri <= repeat; ri++) {
            x = in.nextInt();
            if (x == 0) {
                y = 0;
            } else {
                y = 1.0 / x;
            }
            y = Math.round(y * 100) / 100.0;
            System.out.println("f(" + x + ")=" + y);
        }
    }
}