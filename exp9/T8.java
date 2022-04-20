import java.util.Scanner;

public class T8 {
    public static void main(String[] args) {
        int ri, repeat;
        int i, index, n, t, a[];
        Scanner in = new Scanner(System.in);
        repeat = in.nextInt();
        for (ri = 1; ri <= repeat; ri++) {
            n = in.nextInt();
            a = new int[n];
            for (i = 0; i < n; i++)
                a[i] = in.nextInt();
            int _min, _minidx, _max, _maxidx;
            _min = a[0];
            _max = a[0];
            _minidx = _maxidx = 0;
            for (i = 0; i < n; i++) {
                if (_min > a[i]) {
                    _min = a[i];
                    _minidx = i;
                }
                if (_max < a[i]) {
                    _max = a[i];
                    _maxidx = i;
                }
            }
            int temp, temp2;
            temp = a[_minidx];
            temp2 = a[_maxidx];
            a[_minidx] = a[0];
            a[_maxidx] = a[n - 1];
            a[0] = temp;
            a[n - 1] = temp2;
            for (i = 0; i < n; i++)
                System.out.print(a[i] + " ");
            System.out.println();
        }
    }
}
