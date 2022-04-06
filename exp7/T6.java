import java.util.Scanner;

public class T6 {
    /**
     * 输入一行字符，统计其中单词的个数。各单词之间用空格分隔，空格数可以是多个。
     * 
     * @param args
     */
    public static void main(String[] args) {
        int ri, repeat, count, word, i, len;
        boolean isblank = false;
        String line;
        char c;
        Scanner in = new Scanner(System.in);
        repeat = (in.nextLine()).charAt(0) - '0'; // 输入repeat
        for (ri = 1; ri <= repeat; ri++) {
            line = in.nextLine(); // 输入一行字符
            len = line.length();
            count = 0;
            isblank = false;
            for (i = 0; i < len; i++) {
                c = line.charAt(i);
                if (c == ' ') {
                    isblank = true;
                } else {
                    if (i == 0) {
                        count++;
                    } else {
                        if (isblank) {
                            count++;
                            isblank = false;
                        }
                    }

                }
            }
            System.out.println(count);
        }
    }
}