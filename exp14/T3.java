import java.util.*;

public class T3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double x, y, r, h;
        x = in.nextDouble();
        y = in.nextDouble();
        r = in.nextDouble();
        h = in.nextDouble();
        Cylinder cy = new Cylinder(x, y, r, h);
        System.out.println("r=" + cy.getR());
        System.out.println("h=" + cy.getH());
        System.out.println("V=" + Math.round(cy.calcV() * 100) / 100.);
        System.out.println("S=" + Math.round(cy.calcArea() * 100) / 100.);
    }
}

class Circle {
    private double x, y, r;

    public Circle(double x, double y, double r) {
        this.x = x;
        this.y = y;
        this.r = r;
    }

    public double perimeter() { // 计算圆周长
        return 2 * Math.PI * r;
    }

    public double area() { // 计算圆面积
        return Math.PI * r * r;
    }

    public double getR() {
        return r;
    }
}

/*-----------------------------------*/
class Cylinder extends Circle {
    private double h;

    public Cylinder(double x, double y, double r, double h) {
        super(x, y, r);
        this.h = h;
    }

    public double calcArea() {
        return this.h * 2 * Math.PI * this.getR() + 2 * Math.PI * this.getR() * this.getR();
    }

    public double calcV() {
        return this.h * Math.PI * this.getR() * this.getR();
    }

    public double getH() {
        return this.h;
    }
}