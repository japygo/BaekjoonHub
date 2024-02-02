import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    static int N;
    static int M;
    static int[][] paper;
    static boolean[][] visited;
    static int[] dx = {1, -1, 0, 0};
    static int[] dy = {0, 0, 1, -1};
    static int result = Integer.MIN_VALUE;
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer stringTokenizer = new StringTokenizer(bufferedReader.readLine());
        N = Integer.parseInt(stringTokenizer.nextToken());
        M = Integer.parseInt(stringTokenizer.nextToken());
        paper = new int[N][M];
        visited = new boolean[N][M];
        for (int i = 0; i < N; i++) {
            stringTokenizer = new StringTokenizer(bufferedReader.readLine());
            for (int j = 0; j < M; j++) {
                paper[i][j] = Integer.parseInt(stringTokenizer.nextToken());
            }
        }
        for (int y = 0; y < N; y++) {
            for (int x = 0; x < M; x++) {
                visited[y][x] = true;
                recur(1, x, y, paper[y][x]);
                visited[y][x] = false;
            }
        }
        System.out.println(result);
    }
    public static void recur(int index, int x, int y, int size) {
        if (index == 4) {
            result = Math.max(result, size);
            return;
        }
        for (int i = 0; i < 4; i++) {
            int nx = x + dx[i];
            int ny = y + dy[i];
            if (nx < 0 || nx >= M || ny < 0 || ny >= N
                    || visited[ny][nx]) {
                continue;
            }
            if (index == 2) {
                visited[ny][nx] = true;
                recur(index + 1, x, y, size + paper[ny][nx]);
                visited[ny][nx] = false;
            }
            visited[ny][nx] = true;
            recur(index + 1, nx, ny, size + paper[ny][nx]);
            visited[ny][nx] = false;
        }
    }
}