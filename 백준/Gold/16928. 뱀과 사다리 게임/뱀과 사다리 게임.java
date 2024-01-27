import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {
    static int[] d = {1, 2, 3, 4, 5, 6};
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer stringTokenizer = new StringTokenizer(bufferedReader.readLine());
        int N = Integer.parseInt(stringTokenizer.nextToken());
        int M = Integer.parseInt(stringTokenizer.nextToken());
        int[] board = new int[101];
        int[] count = new int[101];
        Arrays.fill(count, Integer.MAX_VALUE);
        boolean[] visited = new boolean[101];
        for (int i = 0; i < N; i++) {
            stringTokenizer = new StringTokenizer(bufferedReader.readLine());
            int x = Integer.parseInt(stringTokenizer.nextToken());
            int y = Integer.parseInt(stringTokenizer.nextToken());
            board[x] = y;
        }
        for (int i = 0; i < M; i++) {
            stringTokenizer = new StringTokenizer(bufferedReader.readLine());
            int u = Integer.parseInt(stringTokenizer.nextToken());
            int v = Integer.parseInt(stringTokenizer.nextToken());
            board[u] = v;
        }
        Queue<Integer> queue = new LinkedList<>();
        queue.add(1);
        count[1] = 0;
        while (!queue.isEmpty()) {
            int n = queue.poll();
            if (n == 100) {
                break;
            }
            for (int i = 0; i < 6; i++) {
                int next = n + d[i];
                if (next > 100 || visited[next]) {
                    continue;
                }
                int b = board[next];
                if (b != 0) {
                    next = b;
                }
                queue.add(next);
                count[next] = Math.min(count[next], count[n] + 1);
                visited[next] = true;
            }
        }
        System.out.println(count[100]);
    }
}