import java.util.*;

class T4 {
    /**
     * 读入整数n，对于大于等于6的偶数，分解为两个素数之和。要求：
     * 如果n<6或n不是偶数，则要求输出（n不符合题目要求）；否则要求输出一组素数之和a+b，且符合：（1）a<=b；（2）a是所有能分解的格式中的最小素数。
     * 
     * @param args
     */
    public static void main(String[] args) {
        int ri, repeat, n, a, b, i, j;
        boolean prime = true;
        Scanner in = new Scanner(System.in);
        repeat = in.nextInt();
        for (ri = 1; ri <= repeat; ri++) {
            n = in.nextInt();
            a = 2;
            b = 2;
            if (n < 6 || n % 2 == 1) {
                System.out.println(n + "不符合题目要求");
            } else {
                for (i = 2; i < n / 2; i++) {
                    /**
                     * 先找出第一个素数
                     */
                    prime = true;
                    for (j = 2; j <= Math.sqrt(i); j++) {
                        if (i % j == 0) {
                            prime = false;
                            break;
                        }
                    }
                    if (prime) {
                        /**
                         * 判断 n-a 是否为素数
                         */
                        a = i;
                        b = n - i;
                        prime = true;
                        for (j = 2; j < Math.sqrt(b); j++) {
                            if (b % j == 0) {
                                prime = false;
                                break;
                            }
                        }
                        if (prime) {
                            break;
                        }
                    }
                }
                System.out.println(n + "=" + a + "+" + b);
            }
        }
    }
}