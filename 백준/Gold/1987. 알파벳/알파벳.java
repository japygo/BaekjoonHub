import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Set;
import java.util.StringTokenizer;

public class Main {
    static int R;
    static int C;
    static String[][] board;
    static boolean[][] visited;
    static int[] dx = {1, -1, 0, 0};
    static int[] dy = {0, 0, 1, -1};
    static int result = Integer.MIN_VALUE;
    static Set<String> set = new HashSet<>();
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer stringTokenizer = new StringTokenizer(bufferedReader.readLine());
        R = Integer.parseInt(stringTokenizer.nextToken());
        C = Integer.parseInt(stringTokenizer.nextToken());
        board = new String[R][C];
        visited = new boolean[R][C];
        for (int i = 0; i < R; i++) {
            stringTokenizer = new StringTokenizer(bufferedReader.readLine());
            board[i] = stringTokenizer.nextToken().split("");
        }
        recur(0, 0, 1);
        System.out.println(result);
    }
    public static void recur(int x, int y, int count) {
        if (visited[y][x] || set.contains(board[y][x])) {
            return;
        }
        visited[y][x] = true;
        set.add(board[y][x]);
        result = Math.max(result, count);
        for (int i = 0; i < 4; i++) {
            int nx = x + dx[i];
            int ny = y + dy[i];
            if (nx < 0 || nx >= C || ny < 0 || ny >= R
                    || visited[ny][nx]) {
                continue;
            }
            recur(nx, ny, count + 1);
        }
        visited[y][x] = false;
        set.remove(board[y][x]);
    }
}