import java.util.*;

public class T2 {
    public static void main(String args[]) {
        int repeat, ri, score;
        int na = 0, nb = 0, nc = 0, nd = 0, ne = 0;
        Scanner in = new Scanner(System.in);
        repeat = in.nextInt();
        for (ri = 1; ri <= repeat; ri++) {
            score = in.nextInt();
            if (score >= 90) {
                na++;
            } else if (score >= 80) {
                nb++;
            } else if (score >= 70) {
                nc++;
            } else if (score >= 60) {
                nd++;
            } else {
                ne++;
            }
            System.out.println("分数在90-100:" + na);
            System.out.println("分数在80-89:" + nb);
            System.out.println("分数在70-79:" + nc);
            System.out.println("分数在60-69:" + nd);
            System.out.println("分数在0-59:" + ne);
        }
    }
}
