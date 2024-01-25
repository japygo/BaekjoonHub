import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {
    static int N;
    static int M;
    static int[][] map;
    static boolean[][] visited;
    static int[] dx = {1, -1, 0, 0};
    static int[] dy = {0, 0, 1, -1};
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer stringTokenizer = new StringTokenizer(bufferedReader.readLine());
        N = Integer.parseInt(stringTokenizer.nextToken());
        M = Integer.parseInt(stringTokenizer.nextToken());
        map = new int[N][M];
        visited = new boolean[N][M];
        for (int i = 0; i < N; i++) {
            stringTokenizer = new StringTokenizer(bufferedReader.readLine());
            map[i] = Arrays.stream(stringTokenizer.nextToken().split("")).mapToInt(Integer::parseInt).toArray();
        }
        Queue<Node> queue = new LinkedList<>();
        queue.add(new Node(0, 0));
        while (!queue.isEmpty()) {
            Node node = queue.poll();
            int x = node.x;
            int y = node.y;
            if (visited[y][x]) {
                continue;
            }
            visited[y][x] = true;
            for (int i = 0; i < 4; i++) {
                int nx = x + dx[i];
                int ny = y + dy[i];
                if (nx < 0 || nx >= M || ny < 0 || ny >= N
                        || visited[ny][nx]
                        || map[ny][nx] == 0) {
                    continue;
                }
                queue.add(new Node(nx, ny));
                map[ny][nx] = map[y][x] + 1;
            }
        }
        System.out.println(map[N - 1][M - 1]);
    }
    static class Node {
        private final int x;
        private final int y;

        public Node(int x, int y) {
            this.x = x;
            this.y = y;
        }
    }
}