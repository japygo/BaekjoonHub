import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {
    static int[] dx = {1, -1, 0, 0};
    static int[] dy = {0, 0, 1, -1};
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer stringTokenizer = new StringTokenizer(bufferedReader.readLine());
        int N = Integer.parseInt(stringTokenizer.nextToken());
        int M = Integer.parseInt(stringTokenizer.nextToken());
        int[][] map = new int[N][M];
        int[][] count = new int[N][M];
        boolean[][] visited = new boolean[N][M];
        boolean[][] useVisited = new boolean[N][M];
        for (int i = 0; i < N; i++) {
            stringTokenizer = new StringTokenizer(bufferedReader.readLine());
            map[i] = Arrays.stream(stringTokenizer.nextToken().split("")).mapToInt(Integer::parseInt).toArray();
        }
        Queue<Node> queue = new LinkedList<>();
        queue.add(new Node(0, 0, false));
        count[0][0] = 1;
        visited[0][0] = true;
        useVisited[0][0] = true;
        while (!queue.isEmpty()) {
            Node node = queue.poll();
            int x = node.x;
            int y = node.y;
            boolean use = node.use;
            if (x == M - 1 && y == N - 1) {
                break;
            }
            for (int i = 0; i < 4; i++) {
                int nx = x + dx[i];
                int ny = y + dy[i];
                if (nx < 0 || nx >= M || ny < 0 || ny >= N) {
                    continue;
                }
                if (map[ny][nx] == 1 && !use) {
                    queue.add(new Node(nx, ny, true));
                    count[ny][nx] = count[y][x] + 1;
                    useVisited[ny][nx] = true;
                }
                if (map[ny][nx] == 0 && use && !useVisited[ny][nx]) {
                    queue.add(new Node(nx, ny, use));
                    count[ny][nx] = count[y][x] + 1;
                    useVisited[ny][nx] = true;
                }
                if (map[ny][nx] == 0 && !use && !visited[ny][nx]) {
                    queue.add(new Node(nx, ny, use));
                    count[ny][nx] = count[y][x] + 1;
                    visited[ny][nx] = true;
                }
            }
        }
        int result = count[N - 1][M - 1];
        if (result == 0) {
            result = -1;
        }
        System.out.println(result);
    }
    static class Node {
        public int x;
        public int y;
        public boolean use;

        public Node(int x, int y, boolean use) {
            this.x = x;
            this.y = y;
            this.use = use;
        }
    }
}