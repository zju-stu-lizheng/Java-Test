import java.util.Scanner;

public class T7 {
    /**
     * 计算days天后是星期几
     * 
     * @param args
     */
    public static void main(String[] args) {
        int ri, repeat;
        int days, i, j, day, weekdays;
        Scanner in = new Scanner(System.in);
        repeat = in.nextInt();
        for (ri = 1; ri <= repeat; ri++) {
            weekdays = 5;
            days = in.nextInt();
            for (i = 0; i < days; i++) {
                weekdays++;
                if (weekdays == 7) {
                    weekdays = 0;
                }
            }

            System.out.println(weekdays);
        }
    }
}
