
import java.util.*;

public class T6 {
    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        int n, i;
        float r;
        n = in.nextInt();
        for (i = 1; i <= n; i++) {
            r = in.nextFloat();
            Circle cir = new Circle();
            cir.setR(r);
            System.out.println(Math.round(cir.area()));
            System.out.println(Math.round(cir.perimeter()));
        }
    }
}

class Circle {
    public float r;

    public void setR(float R) {
        r = R;
    }

    public double area() {
        return 3.14 * r * r;
    }

    public double perimeter() {
        return 2 * 3.14 * r;
    }
}
