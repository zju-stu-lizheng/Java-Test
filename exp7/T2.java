import java.io.*;

class T2 {
    /**
     * switch
     *
     * @param args
     * @throws IOException
     */
    public static void main(String[] args) throws IOException {
        char c;
        c = (char) System.in.read(); // 输入一个字符
        while (c != '?') { // c不等于字符问号“?”
            switch (c) {
                case 'A':
                    System.out.println("90--100");

                    break;
                case 'B':
                    System.out.println("80--89");

                    break;
                case 'C':
                    System.out.println("70--79");

                    break;
                case 'D':
                    System.out.println("60--69");

                    break;
                case 'E':
                    System.out.println("0--59");
                    break;
                default:
                    System.out.println("Invalid input");
                    break;
            }
            c = (char) System.in.read();
        }
    }
}