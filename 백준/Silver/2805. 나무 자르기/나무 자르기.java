import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer stringTokenizer = new StringTokenizer(bufferedReader.readLine());
        int N = Integer.parseInt(stringTokenizer.nextToken());
        long M = Long.parseLong(stringTokenizer.nextToken());
        stringTokenizer = new StringTokenizer(bufferedReader.readLine());
        long[] forest = new long[N];
        long max = Long.MIN_VALUE;
        for (int i = 0; i < N; i++) {
            forest[i] = Long.parseLong(stringTokenizer.nextToken());
            max = Math.max(max, forest[i]);
        }
        long s = 1;
        long e = max;
        while (s <= e) {
            long mid = (s + e) / 2;
            long wood = 0L;
            for (long tree : forest) {
                if (tree > mid) {
                    wood += tree - mid;
                }
            }
            if (wood >= M) {
                s = mid + 1;
            } else {
                e = mid - 1;
            }
        }
        System.out.println(e);
    }
}