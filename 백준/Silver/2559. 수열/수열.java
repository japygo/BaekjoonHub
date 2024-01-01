import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int K = scanner.nextInt();
        int[] arr = new int[N];
        for (int i = 0; i < N; i++) {
            arr[i] = scanner.nextInt();
        }
        int[] prefix = new int[N + 1];
        Arrays.fill(prefix, 0);
        for (int i = 0; i < N; i++) {
            prefix[i + 1] = prefix[i] + arr[i];
        }
        int max = Integer.MIN_VALUE;
        for (int i = K; i < N + 1; i++) {
            max = Math.max(max, prefix[i] - prefix[i - K]);
        }
        System.out.println(max);
    }
}