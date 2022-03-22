import java.util.*;

public class T2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s;
        char c;
        int blank, digit, i, letter, other;
        blank = digit = letter = other = 0;
        s = in.nextLine();
        for (i = 0; i < 15; i++) {
            c = s.charAt(i);
            if ((c >= 'A' && c <= 'Z') || (c >= 'a' && c <= 'z')) {
                letter++;
            } else if (c >= '0' && c <= '9') {
                digit++;
            } else if (c == ' ') {
                blank++;
            } else {
                other++;
            }
        }
        System.out.print("letter=" + letter + ",blank=" + blank);
        System.out.println(",digit=" + digit + ",other=" + other);
    }
}