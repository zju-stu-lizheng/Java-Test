class AA {
    int x;
    static int y;

    int calc() {
        x++;
        y++;
        return x * x + y * y;
    }
}

public class T00 {
    public static void main(String[] args) {
        AA a1 = new AA();
        AA a2 = new AA();
        System.out.println(a1.calc());// 2
        System.out.println(a2.calc());// 5
    }
}
