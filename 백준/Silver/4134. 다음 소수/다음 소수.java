import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        long n = Long.parseLong(bufferedReader.readLine());
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < n; i++) {
            long num = Long.parseLong(bufferedReader.readLine());
            while (!isPrime(num)) {
                num++;
            }
            result.append(num);
            if (i < n - 1) {
                result.append("\n");
            }
        }
        System.out.println(result);
    }
    public static boolean isPrime(long num) {
        if (num < 2) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }
}