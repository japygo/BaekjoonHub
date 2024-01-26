import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {
    static int l;
    static int[][] chess;
    static boolean[][] visited;
    static int[] dx = {1, 2, 2, 1, -1, -2, -2, -1};
    static int[] dy = {2, 1, -1, -2, -2, -1, 1, 2};
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer stringTokenizer = new StringTokenizer(bufferedReader.readLine());
        int testCase = Integer.parseInt(stringTokenizer.nextToken());
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < testCase; i++) {
            stringTokenizer = new StringTokenizer(bufferedReader.readLine());
            l = Integer.parseInt(stringTokenizer.nextToken());
            chess = new int[l][l];
            visited = new boolean[l][l];
            for (int j = 0; j < l; j++) {
                Arrays.fill(chess[j], Integer.MAX_VALUE);
            }

            stringTokenizer = new StringTokenizer(bufferedReader.readLine());
            int sx = Integer.parseInt(stringTokenizer.nextToken());
            int sy = Integer.parseInt(stringTokenizer.nextToken());

            stringTokenizer = new StringTokenizer(bufferedReader.readLine());
            int ex = Integer.parseInt(stringTokenizer.nextToken());
            int ey = Integer.parseInt(stringTokenizer.nextToken());

            Queue<int[]> queue = new LinkedList<>();
            queue.add(new int[]{sx, sy});
            chess[sy][sx] = 0;
            while (!queue.isEmpty()) {
                int[] n = queue.poll();
                int x = n[0];
                int y = n[1];
                if (visited[y][x]) {
                    continue;
                }
                if (x == ex && y == ey) {
                    result.append(chess[y][x]).append("\n");
                }
                visited[y][x] = true;
                for (int j = 0; j < 8; j++) {
                    int nx = x + dx[j];
                    int ny = y + dy[j];
                    if (nx < 0 || nx >= l || ny < 0 || ny >= l || visited[ny][nx]) {
                        continue;
                    }
                    queue.add(new int[]{nx, ny});
                    chess[ny][nx] = Math.min(chess[ny][nx], chess[y][x] + 1);
                }
            }
        }
        System.out.println(result);
    }
}