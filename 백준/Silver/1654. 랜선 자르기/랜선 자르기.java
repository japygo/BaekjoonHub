import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int K = scanner.nextInt();
        int N = scanner.nextInt();
        long[] lines = new long[K];
        long start = 0;
        long end = Long.MIN_VALUE;
        for (int i = 0; i < K; i++) {
            lines[i] = scanner.nextLong();
            end = Math.max(end, lines[i]);
        }
        end += 1;
        while (start < end) {
            long mid = (start + end) / 2;
            long sum = 0;
            for (long line : lines) {
                sum += line / mid;
            }
            if (sum < N) {
                end = mid;
            } else {
                start = mid + 1;
            }
        }
        System.out.println(start - 1);
    }
}