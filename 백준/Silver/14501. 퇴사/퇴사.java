import java.util.Scanner;

public class Main {
    static int result = Integer.MIN_VALUE;
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int[][] arr = new int[N][2];
        int[] dp = new int[N];
        for (int i = 0; i < N; i++) {
            arr[i][0] = scanner.nextInt();
            arr[i][1] = scanner.nextInt();
            dp[i] = Integer.MIN_VALUE;
        }
        recur(0, arr, N, dp);
        for (int i = 0; i < N; i++) {
            result = Math.max(result, dp[i]);
        }
        System.out.println(result);
    }

    public static int recur(int index, int[][] arr, int N, int[] dp) {
        if (index == N) {
            return 0;
        }

        if (index > N) {
            return Integer.MIN_VALUE;
        }

        if (dp[index] != Integer.MIN_VALUE) {
            return dp[index];
        }

        dp[index] = Math.max(recur(index + arr[index][0], arr, N, dp) + arr[index][1], recur(index + 1, arr, N, dp));

        return dp[index];
    }
}