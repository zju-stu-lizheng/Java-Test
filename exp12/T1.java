import java.util.Scanner;

public class T1 {
    public static void main(String[] args) {
        int ri, repeat, i, j;
        int[] array = new int[6];
        int temp;
        Scanner in = new Scanner(System.in);
        repeat = in.nextInt();
        for (ri = 1; ri <= repeat; ri++) {
            // 先读入五个数据
            for (i = 0; i < 5; i++) {
                array[i] = in.nextInt();
            }
            array[5] = in.nextInt();
            for (i = 4; i >= 0; i--) {
                if (array[i + 1] < array[i]) {
                    temp = array[i];
                    array[i] = array[i + 1];
                    array[i + 1] = temp;
                }
            }
            for (i = 0; i <= 5; i++) {
                System.out.print(array[i] + " ");
            }
            System.out.println();
        }
    }
}