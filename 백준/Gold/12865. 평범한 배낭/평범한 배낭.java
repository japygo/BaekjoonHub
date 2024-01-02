import java.util.Arrays;
import java.util.Scanner;

public class Main {
    static int result = Integer.MIN_VALUE;
    static int[][] dp;
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int K = scanner.nextInt();
        int[][] arr = new int[N][2];
        for (int i = 0; i < N; i++) {
            arr[i][0] = scanner.nextInt();
            arr[i][1] = scanner.nextInt();
        }
        dp = new int[N + 1][K + 1];
        for (int i = 0; i < N; i++) {
            Arrays.fill(dp[i], Integer.MIN_VALUE);
        }
        recur(0, 0, arr, N, K);
        for (int i = 0; i < N + 1; i++) {
            for (int j = 0; j < K + 1; j++) {
                result = Math.max(result, dp[i][j]);
            }
        }
        System.out.println(result);
    }

    public static int recur(int index, int W, int[][] arr, int N, int K) {
        if (W > K) {
            return Integer.MIN_VALUE;
        }

        if (index == N) {
            return 0;
        }

        if (dp[index][W] != Integer.MIN_VALUE) {
            return dp[index][W];
        }

        dp[index][W] = Math.max(recur(index + 1, W + arr[index][0], arr, N, K) + arr[index][1], recur(index + 1, W, arr, N, K));

        return dp[index][W];
    }
}