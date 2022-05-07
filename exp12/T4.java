import java.util.Scanner;

public class T4 {
    public static void main(String[] args) {
        int index, i, n, j;
        char ch;
        String str;
        Scanner in = new Scanner(System.in);
        ch = (in.nextLine()).charAt(0);
        n = (in.nextLine()).charAt(0) - '0';
        for (i = 1; i <= n; i++) {
            str = in.nextLine();
            index = -1;
            for (j = 0; j < str.length(); j++) {
                if (str.charAt(j) == ch) {
                    index = j;
                }
            }
            if (index >= 0)
                System.out.println(index);
            else
                System.out.println("Not Found");
        }
    }
}