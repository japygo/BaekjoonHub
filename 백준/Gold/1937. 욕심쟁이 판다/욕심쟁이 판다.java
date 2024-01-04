import java.util.Scanner;

public class Main {
    static int n;
    static int[][] graph;
    static int[] dx = {0,0,1,-1};
    static int[] dy = {1,-1,0,0};
    static int[][] dp;
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        n = scanner.nextInt();
        graph = new int[n][n];
        dp = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                graph[i][j] = scanner.nextInt();
            }
        }
        for (int y = 0; y < n; y++) {
            for (int x = 0; x < n; x++) {
                recur(y, x);
            }
        }
        int result = 0;
        for (int y = 0; y < n; y++) {
            for (int x = 0; x < n; x++) {
                result = Math.max(result, dp[y][x]);
            }
        }
        System.out.println(result + 1);
    }

    public static int recur(int y, int x) {
        if (dp[y][x] != 0) {
            return dp[y][x];
        }
        for (int i = 0 ; i < 4; i++) {
            int nx = x + dx[i];
            int ny = y + dy[i];
            if (nx >= 0 && nx < n && ny >= 0 && ny < n) {
                if (graph[y][x] < graph[ny][nx]) {
                    dp[y][x] = Math.max(dp[y][x], recur(ny, nx) + 1);
                }
            }
        }
        return dp[y][x];
    }
}