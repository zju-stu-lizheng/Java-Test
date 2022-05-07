import java.util.Scanner;

public class T3 {
    public static void main(String[] args) {
        int count, i, j, n;
        char ch;
        String str;
        Scanner in = new Scanner(System.in);
        n = (in.nextLine()).charAt(0) - '0';
        for (i = 1; i <= n; i++) {
            count = 0;
            str = in.nextLine();
            int len = str.length();
            for (j = 0; j < len; j++) {
                if (str.charAt(j) != 'A' && str.charAt(j) != 'E' && str.charAt(j) != 'I' && str.charAt(j) != 'O'
                        && str.charAt(j) != 'U') {
                    if (str.charAt(j) >= 'A' && str.charAt(j) <= 'Z') {
                        count++;
                    }
                }
            }
            System.out.println(count);
        }
    }
}