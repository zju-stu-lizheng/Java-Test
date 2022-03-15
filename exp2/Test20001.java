import java.util.Scanner;

public class Test20001 {
   public static void main(String args[]) {
      int a, b, sum, diff;
      Scanner in = new Scanner(System.in);
      a = in.nextInt();
      b = in.nextInt();
      sum = a + b;
      diff = a - b;
      System.out.println("The sum is " + sum);
      System.out.println("The difference is " + diff);
   }
}
