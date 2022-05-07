import java.util.Scanner;

public class T2 {
    public static void main(String[] args) {
        int len, count, i, k;
        char ch;
        String str;
        Scanner in = new Scanner(System.in);
        str = in.next();
        len = str.length();
        count = 0;
        for (i = 0; i < len; i++) {
            if (str.charAt(i) == '#') {
                System.out.println(count);
                count = 0;
            } else {
                count++;
            }
        }
    }
}