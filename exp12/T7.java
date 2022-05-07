import java.util.Scanner;

public class T7 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double n;
        n = in.nextDouble(); // 输入边长
        Cube cube1 = new Cube(n);
        System.out.println("Length=" + cube1.getLength());
        System.out.println("Surface area=" + cube1.calcArea());
        System.out.println("Volume=" + cube1.calcV());
    }
}

class Cube {
    private double length;

    public Cube(double length) {
        this.length = length;
    }

    public void setLength(double l) {
        length = l;
    }

    public double getLength() {
        return length;
    }

    public double calcArea() {
        return 6 * length * length;
    }

    public double calcV() {
        return length * length * length;
    }
}