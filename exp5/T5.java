import java.util.Scanner;

public class T5 {
    public static void main(String[] args) {
        /**
         * Celsius to Fahrenheit
         */
        int ri, repeat;
        int begin, c, end, f;
        Scanner in = new Scanner(System.in);
        repeat = in.nextInt();
        for (ri = 1; ri <= repeat; ri++) {
            begin = in.nextInt();
            end = in.nextInt();
            System.out.println("Celsius Fahrenheit");
            for (c = begin; c <= end; c++) {
                f = 32 + c * 9 / 5;
                System.out.println(c + "	" + f);
            }

        }
    }
}