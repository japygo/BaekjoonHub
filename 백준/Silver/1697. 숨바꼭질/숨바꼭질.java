import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Main {
    static int N;
    static int K;
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        N = scanner.nextInt();
        K = scanner.nextInt();
        int[] map = new int[100_001];
        boolean[] visited = new boolean[100_001];
        Queue<Integer> queue = new LinkedList<>();
        queue.add(N);
        Arrays.fill(map, Integer.MAX_VALUE);
        map[N] = 0;
        while (!queue.isEmpty()) {
            int n = queue.poll();
            if (n == K) {
                break;
            }
            visited[n] = true;
            int a = n + 1;
            int b = n - 1;
            int c = n * 2;
            if (a >= 0 && a < 100_001 && !visited[a]) {
                queue.add(a);
                map[a] = Math.min(map[a], map[n] + 1);
            }
            if (b >= 0 && b < 100_001 && !visited[b]) {
                queue.add(b);
                map[b] = Math.min(map[b], map[n] + 1);
            }
            if (c >= 0 && c < 100_001 && !visited[c]) {
                queue.add(c);
                map[c] = Math.min(map[c], map[n] + 1);
            }
        }
        System.out.println(map[K]);
    }
}