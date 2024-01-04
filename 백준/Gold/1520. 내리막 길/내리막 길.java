import java.util.Arrays;
import java.util.Scanner;

public class Main {
    static int M;
    static int N;
    static int[][] graph;
    static int[] dx = {0,0,1,-1};
    static int[] dy = {1,-1,0,0};
    static int[][] dp;
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        M = scanner.nextInt();
        N = scanner.nextInt();
        graph = new int[M][N];
        for (int i = 0; i < M; i++) {
            for (int j = 0; j < N; j++) {
                graph[i][j] = scanner.nextInt();
            }
        }
        dp = new int[M][N];
        for (int i = 0; i < M; i++) {
            Arrays.fill(dp[i], Integer.MIN_VALUE);
        }
        int result = recur(0, 0);
        System.out.println(result);
    }

    public static int recur(int y, int x) {
        if (y == M - 1 && x == N - 1) {
            return 1;
        }

        if (dp[y][x] != Integer.MIN_VALUE) {
            return dp[y][x];
        }

        int route = 0;
        for (int i = 0 ; i < 4; i++) {
            int nx = x + dx[i];
            int ny = y + dy[i];
            if (nx >= 0 && nx < N && ny >= 0 && ny < M) {
                if (graph[y][x] > graph[ny][nx]) {
                    route += recur(ny, nx);
                }
            }
        }
        dp[y][x] = route;
        return dp[y][x];
    }
}