import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class Main {
    static ArrayList<Integer>[] graph;
    static int[] parents;
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer stringTokenizer = new StringTokenizer(bufferedReader.readLine());
        int N = Integer.parseInt(stringTokenizer.nextToken());
        graph = new ArrayList[N + 1];
        parents = new int[N + 1];
        for (int i = 0; i < N + 1; i++) {
            graph[i] = new ArrayList<>();
        }
        for (int i = 0; i < N - 1; i++) {
            stringTokenizer = new StringTokenizer(bufferedReader.readLine());
            int a = Integer.parseInt(stringTokenizer.nextToken());
            int b = Integer.parseInt(stringTokenizer.nextToken());
            graph[a].add(b);
            graph[b].add(a);
        }
        recur(1, 0);
        StringBuilder result = new StringBuilder();
        for (int i = 2; i < N + 1; i++) {
            result.append(parents[i] + "\n");
        }
        System.out.println(result);
    }

    public static void recur(int node, int parent) {
        parents[node] = parent;
        for (int next : graph[node]) {
            if (next == parent) {
                continue;
            }
            recur(next, node);
        }
    }
}