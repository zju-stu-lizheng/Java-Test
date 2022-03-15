public class T {
    public static void main(String[] args) {
        int a = 2, b = 6;
        switch (a + 3) {
            case 5:
                switch (b) {
                    default:
                        a = a - 2;
                    case 6:
                        a = a + 2;
                        break;
                }
            default:
                a = a * 2;
        }
        System.out.print(a);
    }
}
