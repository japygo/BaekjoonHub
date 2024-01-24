import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {
    static int N;
    static int M;
    static int V;
    static ArrayList<Integer>[] graph;
    static boolean[] visited;
    static StringBuilder result = new StringBuilder();
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer stringTokenizer = new StringTokenizer(bufferedReader.readLine());
        N = Integer.parseInt(stringTokenizer.nextToken());
        M = Integer.parseInt(stringTokenizer.nextToken());
        V = Integer.parseInt(stringTokenizer.nextToken());
        graph = new ArrayList[N + 1];
        visited = new boolean[N + 1];
        for (int i = 0; i < N + 1; i++) {
            graph[i] = new ArrayList<>();
        }
        for (int i = 0; i < M; i++) {
            stringTokenizer = new StringTokenizer(bufferedReader.readLine());
            int a = Integer.parseInt(stringTokenizer.nextToken());
            int b = Integer.parseInt(stringTokenizer.nextToken());
            graph[a].add(b);
            graph[b].add(a);
        }
        for (int i = 0; i < N + 1; i++) {
            Collections.sort(graph[i]);
        }
        dfs(V);
        Arrays.fill(visited, false);
        bfs(V);
        System.out.println(result);
    }
    public static void dfs(int node) {
        result.append(node).append(" ");
        visited[node] = true;
        for (Integer next : graph[node]) {
            if (!visited[next]) {
                dfs(next);
            }
        }
    }
    public static void bfs(int start) {
        result.append("\n");
        Queue<Integer> queue = new LinkedList<>();
        queue.add(start);
        while (!queue.isEmpty()) {
            int node = queue.poll();
            if (visited[node]) {
                continue;
            }
            result.append(node).append(" ");
            visited[node] = true;
            for (Integer next : graph[node]) {
                if (!visited[next]) {
                    queue.add(next);
                }
            }
        }
    }
}