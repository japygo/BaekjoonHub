import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main {
    static int N;
    static int[][] map;
    static boolean[][] visited;
    static int[] dx = {1, -1, 0, 0};
    static int[] dy = {0, 0, 1, -1};
    static int count;
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        N = scanner.nextInt();
        map = new int[N][N];
        visited = new boolean[N][N];
        for (int i = 0; i < N; i++) {
            String[] split = scanner.next().split("");
            map[i] = Arrays.stream(split).mapToInt(Integer::parseInt).toArray();
        }
        List<Integer> countList = new ArrayList<>();
        for (int y = 0; y < N; y++) {
            for (int x = 0; x < N; x++) {
                if (map[y][x] == 0 || visited[y][x]) {
                    continue;
                }
                count = 0;
                recur(y, x);
                countList.add(count);
            }
        }
        System.out.println(countList.size());
        countList.stream().sorted().forEach(System.out::println);
    }
    public static void recur(int y, int x) {
        visited[y][x] = true;
        count += 1;
        for (int i = 0; i < 4; i++) {
            int nx = x + dx[i];
            int ny = y + dy[i];
            if (nx < 0 || nx >= N || ny < 0 || ny >= N || map[ny][nx] == 0) {
                continue;
            }
            if (!visited[ny][nx]) {
                recur(ny, nx);
            }
        }
    }
}