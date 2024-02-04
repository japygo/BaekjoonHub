import java.util.LinkedList;
import java.util.Queue;

class Solution {
    private int[] dx = {1, -1, 0, 0};
    private int[] dy = {0, 0, 1, -1};
    public int solution(int[][] maps) {
        int answer = 0;
        int n = maps.length;
        int m = maps[0].length;
        maps[n - 1][m - 1] = -1;
        boolean[][] visited = new boolean[n][m];
        Queue<int[]> queue = new LinkedList<>();
        queue.add(new int[]{0, 0});
        visited[0][0] = true;
        while (!queue.isEmpty()) {
            int[] node = queue.poll();
            int x = node[0];
            int y = node[1];
            for (int i = 0; i < 4; i++) {
                int nx = x + dx[i];
                int ny = y + dy[i];
                if (nx < 0 || nx >= m || ny < 0 || ny >= n
                        || visited[ny][nx]
                        || maps[ny][nx] == 0) {
                    continue;
                }
                visited[ny][nx] = true;
                maps[ny][nx] = maps[y][x] + 1;
                queue.add(new int[]{nx, ny});
            }
        }
        answer = maps[n - 1][m - 1];
        return answer;
    }
}