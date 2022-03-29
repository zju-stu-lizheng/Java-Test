import java.util.Scanner;

public class T7 {
    /**
     * 输入一个整数，从高位开始逐位输出它的各位数字。
     * 
     * @param args
     */
    public static void main(String[] args) {
        int ri, repeat;
        long digit;
        long n, temp, pow;
        Scanner in = new Scanner(System.in);
        repeat = in.nextInt();
        for (ri = 1; ri <= repeat; ri++) {
            n = in.nextLong();
            if (n < 0) {
                n = -n;
            }
            // first, calculate the number of digits
            temp = n;
            pow = 1;
            while (temp > 0) {
                temp /= 10;
                pow *= 10;
            }
            pow /= 10;
            // second, %pow can get the top digit
            temp = n;
            while (pow > 0) {
                digit = temp / pow;
                temp -= digit * pow;
                pow /= 10;
                System.out.print(digit + " ");
            }

            System.out.println();
        }
    }
}