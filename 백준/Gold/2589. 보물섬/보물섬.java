import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int y = scanner.nextInt();
        int x = scanner.nextInt();
        String[][] graph = new String[y][x];
        for (int i = 0; i < y; i++) {
            graph[i] = scanner.next().split("");
        }
        int result = 0;
        int[] dx = {0,0,1,-1};
        int[] dy = {1,-1,0,0};
        for (int i = 0; i < y; i++) {
            for (int j = 0; j < x; j++) {
                if (graph[i][j].equals("L")) {
                    boolean[][] visited = new boolean[y][x];
                    int[][] dist = new int[y][x];
                    Queue<int[]> queue = new LinkedList<>();
                    queue.add(new int[] {i,j});
                    visited[i][j] = true;
                    while (!queue.isEmpty()) {
                        int[] index = queue.poll();
                        int ey = index[0];
                        int ex = index[1];
                        for (int k = 0; k < 4; k++) {
                            int ny = ey + dy[k];
                            int nx = ex + dx[k];
                            if (ny >= 0 && ny < y && nx >= 0 && nx < x
                                    && (graph[ny][nx].equals("L"))
                                    && (!visited[ny][nx])) {
                                visited[ny][nx] =  true;
                                dist[ny][nx] = dist[ey][ex] + 1;
                                result = Math.max(result, dist[ny][nx]);
                                queue.add(new int[] {ny,nx});
                            }
                        }
                    }
                }
            }
        }
        System.out.println(result);
    }
}