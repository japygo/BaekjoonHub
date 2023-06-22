import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.StringTokenizer;

public class Main {
    static int[] visited;
    static ArrayList<Integer>[] arr;
    static int cnt = 1;

    public static void main(String[] args) throws Exception {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer stringTokenizer = new StringTokenizer(bufferedReader.readLine());
        int n = Integer.parseInt(stringTokenizer.nextToken()) + 1;
        int m = Integer.parseInt(stringTokenizer.nextToken());
        int r = Integer.parseInt(stringTokenizer.nextToken());
        visited = new int[n];
        arr = new ArrayList[n];
        for (int i = 1; i < n; i++) {
            visited[i] = 0;
            arr[i] = new ArrayList<>();
        }
        for (int i = 0; i < m; i++) {
            stringTokenizer = new StringTokenizer(bufferedReader.readLine());
            int u = Integer.parseInt(stringTokenizer.nextToken());
            int v = Integer.parseInt(stringTokenizer.nextToken());
            arr[u].add(v);
            arr[v].add(u);
        }
        for (int i = 1; i < n; i++) {
            Collections.sort(arr[i]);
        }
        dfs(r);
        for (int i = 1; i < n; i++) {
            System.out.println(visited[i]);
        }
    }
    public static void dfs(int n) {
        visited[n] = cnt++;
        for (int i : arr[n]) {
            if (visited[i] == 0) {
                dfs(i);
            }
        }
    }
}