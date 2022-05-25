import java.util.Scanner;

public class T1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n, ri;
        n = in.nextInt();
        for (ri = 0; ri < n; ri++) {
            String std = in.next();
            for (int i = std.length() - 1; i >= 0; i--) {
                System.out.print(std.charAt(i));
            }
            System.out.println("");
        }
    }
}
