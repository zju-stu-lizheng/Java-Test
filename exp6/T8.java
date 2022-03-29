import java.util.Scanner;

public class T8 {
    /**
     * 输入正整数m和n（1900<=m<=n<=2100），分别代表年份的起止值，输出该范围内所有的闰年。判断闰年的条件是：能被 4 整除但不能被 100
     * 整除，或者能被 400 整除。
     * 
     * @param args
     */
    public static void main(String[] args) {
        int year, m, n, repeat, ri;
        Scanner in = new Scanner(System.in);
        repeat = in.nextInt();
        for (ri = 1; ri <= repeat; ri++) {
            m = in.nextInt();
            n = in.nextInt();
            for (year = m; year <= n; year++) {
                if (year % 4 == 0) {
                    if (year % 100 == 0) {
                        if (year % 400 == 0) {
                            System.out.println(year);
                        }
                    } else {
                        System.out.println(year);
                    }
                }
            }
        }
    }
}