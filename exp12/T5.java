import java.util.Scanner;

public class T5 {
    public static void main(String[] args) {
        int ri, repeat, i, number;
        char ch;
        String str;
        Scanner in = new Scanner(System.in);
        repeat = in.nextInt();
        for (ri = 1; ri <= repeat; ri++) {
            str = in.next();
            number = 0;
            for (i = 0; i < str.length(); i++) {
                ch = str.charAt(i);
                if (ch >= '0' && ch <= '9') {
                    number = number * 16 + ch - '0';
                } else if (ch >= 'a' && ch <= 'f') {
                    number = number * 16 + ch - 'a' + 10;
                } else if (ch >= 'A' && ch <= 'F') {
                    number = number * 16 + ch - 'A' + 10;
                }
            }
            System.out.println(number);
        }
    }
}