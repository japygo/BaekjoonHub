import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
    static int N;
    static int M;
    static int[][] iceberg;
    static boolean[][] visited;
    static int[] dx = {1, -1, 0, 0};
    static int[] dy = {0, 0, 1, -1};
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer stringTokenizer = new StringTokenizer(bufferedReader.readLine());
        N = Integer.parseInt(stringTokenizer.nextToken());
        M = Integer.parseInt(stringTokenizer.nextToken());
        iceberg = new int[N][M];
        visited = new boolean[N][M];
        for (int y = 0; y < N; y++) {
            stringTokenizer = new StringTokenizer(bufferedReader.readLine());
            for (int x = 0; x < M; x++) {
                iceberg[y][x] = Integer.parseInt(stringTokenizer.nextToken());
            }
        }
        int year = 0;
        while (true) {
            int count = 0;
            boolean isNone = false;
            for (int y = 0; y < N; y++) {
                for (int x = 0; x < M; x++) {
                    if (visited[y][x] || iceberg[y][x] <= 0) {
                        continue;
                    }
                    if (!isNone) {
                        isNone = true;
                    }
                    count++;
                    recur(x, y);
                }
            }
            if (!isNone) {
                year = 0;
                break;
            }
            if (count >= 2) {
                break;
            }
            year++;
            for (int i = 0; i < N; i++) {
                Arrays.fill(visited[i], false);
            }
        }
        System.out.println(year);
    }
    public static void recur(int x, int y) {
        visited[y][x] = true;
        int countZero = 0;
        for (int i = 0; i < 4; i++) {
            int nx = x + dx[i];
            int ny = y + dy[i];
            if (nx < 0 || nx >= M || ny < 0 || ny >= N
                    || visited[ny][nx]) {
                continue;
            }
            if (iceberg[ny][nx] <= 0) {
                countZero++;
                continue;
            }
            visited[ny][nx] = true;
            recur(nx, ny);
        }
        iceberg[y][x] -= countZero;
    }
}