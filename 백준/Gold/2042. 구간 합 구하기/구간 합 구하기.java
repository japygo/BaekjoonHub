import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws Exception {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer stringTokenizer = new StringTokenizer(bufferedReader.readLine());
        StringBuilder result = new StringBuilder();
        int n = Integer.parseInt(stringTokenizer.nextToken());
        int m = Integer.parseInt(stringTokenizer.nextToken());
        int k = Integer.parseInt(stringTokenizer.nextToken());
        int size = 1;
        while (size < n) {
            size *= 2;
        }
        long[] arr = new long[size * 2];
        for (int i = 0; i < n; i++) {
            arr[size + i] = Long.parseLong(bufferedReader.readLine());
        }
        for (int i = size - 1; i > 0; i--) {
            arr[i] = arr[2 * i] + arr[2 * i + 1];
        }
        for (int i = 1; i <= m + k; i++) {
            stringTokenizer = new StringTokenizer(bufferedReader.readLine());
            int a = Integer.parseInt(stringTokenizer.nextToken());
            int b = Integer.parseInt(stringTokenizer.nextToken());
            if (a == 1) {
                long c = Long.parseLong(stringTokenizer.nextToken());
                b = b + size - 1;
                arr[b] = c;
                while (b > 0) {
                    b /= 2;
                    arr[b] = arr[2 * b] + arr[2 * b + 1];
                }
            } else {
                int c = Integer.parseInt(stringTokenizer.nextToken());
                b = b + size - 1;
                c = c + size - 1;
                long sum = 0;
                while (b <= c) {
                    if (b % 2 == 1) {
                        sum += arr[b++];
                    }
                    if (c % 2 == 0) {
                        sum += arr[c--];
                    }
                    b /= 2;
                    c /= 2;
                }
                result.append(sum);
                if (i < m + k) {
                    result.append("\n");
                }
            }
        }
        System.out.println(result);
    }
}