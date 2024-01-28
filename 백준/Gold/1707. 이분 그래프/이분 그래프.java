import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
    static int K;
    static int V;
    static int E;
    static ArrayList<Integer>[] graph;
    static int[] visited;
    static boolean isSame;
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer stringTokenizer = new StringTokenizer(bufferedReader.readLine());
        K = Integer.parseInt(stringTokenizer.nextToken());
        for (int i = 0; i < K; i++) {
            stringTokenizer = new StringTokenizer(bufferedReader.readLine());
            V = Integer.parseInt(stringTokenizer.nextToken());
            E = Integer.parseInt(stringTokenizer.nextToken());
            graph = new ArrayList[V + 1];
            for (int j = 0; j < V + 1; j++) {
                graph[j] = new ArrayList<>();
            }
            visited = new int[V + 1];
            Arrays.fill(visited, -1);
            for (int j = 0; j < E; j++) {
                stringTokenizer = new StringTokenizer(bufferedReader.readLine());
                int a = Integer.parseInt(stringTokenizer.nextToken());
                int b = Integer.parseInt(stringTokenizer.nextToken());
                graph[a].add(b);
                graph[b].add(a);
            }
            isSame = false;
            for (int j = 1; j < V + 1; j++) {
                recur(j);
                if (isSame) {
                    break;
                }
            }
            if (isSame) {
                System.out.println("NO");
            } else {
                System.out.println("YES");
            }
        }
    }
    public static void recur(int index) {
        for (Integer next : graph[index]) {
            if (visited[next] == -1) {
                visited[next] = (visited[index] + 1) % 2;
                recur(next);
            } else if (visited[next] == visited[index]) {
                isSame = true;
                break;
            }
        }
    }
}