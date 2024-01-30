import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    static int N;
    static String[][] picture;
    static boolean[][] visited;
    static boolean[][] visited2;
    static int[] dx = {1, -1, 0, 0};
    static int[] dy = {0, 0, 1, -1};
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer stringTokenizer = new StringTokenizer(bufferedReader.readLine());
        N = Integer.parseInt(stringTokenizer.nextToken());
        picture = new String[N][N];
        visited = new boolean[N][N];
        visited2 = new boolean[N][N];
        for (int i = 0; i < N; i++) {
            stringTokenizer = new StringTokenizer(bufferedReader.readLine());
            picture[i] = stringTokenizer.nextToken().split("");
        }
        int count = 0;
        for (int y = 0; y < N; y++) {
            for (int x = 0; x < N; x++) {
                if (!visited[y][x]) {
                    count++;
                    recur(x, y, picture[y][x]);
                }
            }
        }
        System.out.println(count);
        int count2 = 0;
        for (int y = 0; y < N; y++) {
            for (int x = 0; x < N; x++) {
                if (!visited2[y][x]) {
                    count2++;
                    recur2(x, y, picture[y][x]);
                }
            }
        }
        System.out.println(count2);
    }
    public static void recur(int x, int y, String color) {
        if (visited[y][x]) {
            return;
        }
        visited[y][x] = true;
        for (int i = 0; i < 4; i++) {
            int nx = x + dx[i];
            int ny = y + dy[i];
            if (nx < 0 || nx >= N || ny < 0 || ny >= N
                    || visited[ny][nx] || !color.equals(picture[ny][nx])) {
                continue;
            }
            recur(nx, ny, color);
        }
    }
    public static void recur2(int x, int y, String color) {
        if (visited2[y][x]) {
            return;
        }
        visited2[y][x] = true;
        for (int i = 0; i < 4; i++) {
            int nx = x + dx[i];
            int ny = y + dy[i];
            if (nx < 0 || nx >= N || ny < 0 || ny >= N
                    || visited2[ny][nx]) {
                continue;
            }
            if (isBlind(color)) {
                if (isBlind(picture[ny][nx])) {
                    recur2(nx, ny, color);
                }
            } else {
                if (color.equals(picture[ny][nx])) {
                    recur2(nx, ny, color);
                }
            }
        }
    }
    public static boolean isBlind(String color) {
        return "R".equals(color) || "G".equals(color);
    }
}