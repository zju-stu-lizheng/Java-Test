import java.util.Scanner;

public class Test20011 {
    public static void main(String args[]) {
        int a, b, c, n;
        Scanner in = new Scanner(System.in);
        n = in.nextInt();
        c = n % 10;
        int n2 = n / 10;
        b = n2 % 10;
        n2 = n2 / 10;
        a = n2 % 10;
        System.out.println("number" + n + ":digit1=" + c + ",digit2=" + b + ",digit3=" + a);
    }
}