import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer stringTokenizer = new StringTokenizer(bufferedReader.readLine());
        long a = Long.parseLong(stringTokenizer.nextToken());
        long b = Long.parseLong(stringTokenizer.nextToken());
        System.out.println(a * b / gcd(a, b));
    }
    public static long gcd(long a, long b) {
        long c = a % b;
        while(c != 0) {
            a = b;
            b = c;
            c = a % b;
        }
        return b;
    }
}