import java.util.Scanner;

public class Test30009 {
    public static void main(String args[]) {
        int repeat, ri;
        int a, b, c, d;
        double x1, x2;
        Scanner in = new Scanner(System.in);
        repeat = in.nextInt();
        for (ri = 1; ri <= repeat; ri++) {
            a = in.nextInt();
            b = in.nextInt();
            c = in.nextInt();
            d = b * b - 4 * a * c;
            if (a == 0 && b == 0 && c == 0) {
                System.out.println("a=b=c=0,meaningless");
            } else if (a == 0 && b == 0) {
                System.out.println("a=b=0,c!=0,error");
            } else if (a == 0) {
                x1 = Math.round(-(double) c / b * 100) / 100.0;
                System.out.println("x=" + x1);
            } else if (d >= 0) {
                x1 = Math.round((-b + Math.sqrt(d)) / (2 * a) * 100) / 100.0;
                x2 = Math.round((-b - Math.sqrt(d)) / (2 * a) * 100) / 100.0;
                System.out.println("x1=" + x1);
                System.out.println("x2=" + x2);
            } else {
                x1 = Math.round((-b) / (2.0 * a) * 100) / 100.0;
                x2 = Math.round((-b) / (2.0 * a) * 100) / 100.0;
                if (a > 0) {
                    System.out.println("x1=" + x1 + "+" + Math.round(Math.sqrt(-d) / (2 * a) * 100) / 100.0 + "i");
                    System.out.println("x2=" + x2 + "-" + Math.round(Math.sqrt(-d) / (2 * a) * 100) / 100.0 + "i");
                } else {
                    System.out.println("x1=" + x1 + "+" + Math.round(-Math.sqrt(-d) / (2 * a) * 100) / 100.0 + "i");
                    System.out.println("x2=" + x2 + "-" + Math.round(-Math.sqrt(-d) / (2 * a) * 100) / 100.0 + "i");
                }

            }
        }
    }
}