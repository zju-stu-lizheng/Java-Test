import java.io.*;
import java.util.Scanner;

public class Test20014 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int b1, b2, b3, b4, b5;
        b5 = a % 10;
        a /= 10;
        b4 = a % 10;
        a /= 10;
        b3 = a % 10;
        a /= 10;
        b2 = a % 10;
        a /= 10;
        b1 = a % 10;
        a /= 10;

        System.out.println(b1 * 100 + b3 * 10 + b5);
    }
}
