import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {
    static int M;
    static int N;
    static int[][] boxes;
    static int[] dx = {1, -1, 0, 0};
    static int[] dy = {0, 0, 1, -1};
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer stringTokenizer = new StringTokenizer(bufferedReader.readLine());
        M = Integer.parseInt(stringTokenizer.nextToken());
        N = Integer.parseInt(stringTokenizer.nextToken());
        boxes = new int[N][M];
        boolean isAll = true;
        Queue<int[]> queue = new LinkedList<>();
        for (int y = 0; y < N; y++) {
            stringTokenizer = new StringTokenizer(bufferedReader.readLine());
            for (int x = 0; x < M; x++) {
                int num = Integer.parseInt(stringTokenizer.nextToken());
                if (isAll && num == 0) {
                    isAll = false;
                }
                if (num == 1) {
                    queue.add(new int[]{x, y});
                }
                boxes[y][x] = num;
            }
        }
        if (isAll) {
            System.out.println(0);
            return;
        }
        while (!queue.isEmpty()) {
            int[] n = queue.poll();
            int x = n[0];
            int y = n[1];
            for (int i = 0; i < 4; i++) {
                int nx = x + dx[i];
                int ny = y + dy[i];
                if (nx < 0 || nx >= M || ny < 0 || ny >= N
                        || boxes[ny][nx] == -1 || boxes[ny][nx] != 0) {
                    continue;
                }
                queue.add(new int[]{nx, ny});
                boxes[ny][nx] = boxes[y][x] + 1;
            }
        }
        boolean hasZero = false;
        int result = Integer.MIN_VALUE;
        for (int y = 0; y < N; y++) {
            for (int x = 0; x < M; x++) {
                int num = boxes[y][x];
                if (num == 0) {
                    hasZero = true;
                    break;
                }
                result = Math.max(result, num);
            }
        }
        if (hasZero) {
            System.out.println(-1);
            return;
        }
        System.out.println(result - 1);
    }
}