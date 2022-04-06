import java.util.*;

public class T8 {
    /**
     * 读入一个正整数n(n>1)，如果它是素数，则给出是素数的信息，否则输出它的质因子乘积的表达式。
     * 输出要求(所有的输出中不包含空格)：
     * System.out.println(n+"是素数"); //当n是素数时
     * System.out.print(n+"="); //非素数时
     * System.out.print(i+"*"); //非最后一个质因子
     * System.out.println(i); //最后一个质因子
     * 
     * @param args
     */
    public static void main(String[] args) {
        int ri, repeat, n, i;
        boolean prime = true;
        Scanner in = new Scanner(System.in);
        repeat = in.nextInt();
        for (ri = 1; ri <= repeat; ri++) {
            n = in.nextInt();
            prime = true;
            for (i = 2; i <= Math.sqrt(n); i++) {
                if (n % i == 0) {
                    prime = false;
                    break;
                }
            }
            if (prime) {
                System.out.println(n + "是素数");
            } else {
                System.out.print(n + "=");
                for (i = 2; n > 1; i++) {
                    while (n % i == 0) {
                        if (n == i) {
                            System.out.println(i);
                        } else {
                            System.out.print(i + "*");
                        }
                        n /= i;
                    }
                }
            }
        }
    }
}