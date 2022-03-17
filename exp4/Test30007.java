import java.io.*;

public class Test30007 {
    public static void main(String[] args) throws IOException {
        char ch;
        ch = (char) System.in.read();
        while (ch != '?') {
            if (ch >= 'a' && ch <= 'z') {
                ch -=32;
            }else if (ch >= 'A' && ch <= 'Z') {
                ch +=32;
            }
            System.out.print(ch);
            ch = (char) System.in.read();
        }
    }
}