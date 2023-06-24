import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {

    static int[] d;
    static int a;
    static int b;
    public static void main(String[] args) throws Exception {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(bufferedReader.readLine());
        d = new int[n + 1];
        fib(n);
        fibonacci(n);
        System.out.println(a + " " + b);
    }
    public static int fib(int n) {
        if (n == 1 || n == 2) {
            a++;
            return 1;
        }
        return fib(n - 1) + fib(n - 2);
    }

    public static int fibonacci(int n) {
        d[1] = 1;
        d[2] = 1;
        for (int i = 3; i <= n; i++) {
            b++;
            d[i] = d[i - 1] + d[i - 2];
        }
        return d[n];
    }
}