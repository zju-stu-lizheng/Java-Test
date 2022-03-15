import java.util.Scanner;

public class Test30003 {
    public static void main(String[] args) {
        int ri, repeat;
        double a, b, c, area, perimeter;
        double s;
        Scanner in = new Scanner(System.in);
        repeat = in.nextInt();
        for (ri = 1; ri <= repeat; ri++) {
            a = in.nextFloat();
            b = in.nextFloat();
            c = in.nextFloat();

            if (a + b > c && a + c > b && b + c > a) {
                s = (a + b + c) / 2;
                perimeter = 2 * s;
                area = Math.sqrt(s * (s - a) * (s - b) * (s - c));

                System.out.println(
                        "area=" + (int) (area * 100 + 0.5) / 100. + ";perimeter="
                                + (int) (perimeter * 100 + 0.5) / 100.);
            } else {
                System.out.println("These sides do not correspond to a valid triangle");
            }
        }
    }
}