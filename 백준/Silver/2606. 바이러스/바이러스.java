import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    static ArrayList<Integer>[] graph;
    static boolean[] visited;
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int c = scanner.nextInt();
        int n = scanner.nextInt();
        graph = new ArrayList[c + 1];
        for (int i = 0; i < c + 1; i++) {
            graph[i] = new ArrayList<>();
        }
        for (int i = 0; i < n; i++) {
            int a = scanner.nextInt();
            int b = scanner.nextInt();
            graph[a].add(b);
            graph[b].add(a);
        }
        visited = new boolean[c + 1];
        Arrays.fill(visited, false);
        recur(1);
        int result = 0;
        for (int i = 2; i < c + 1; i++) {
            if (visited[i]) {
                result += 1;
            }
        }
        System.out.println(result);
    }

    public static void recur(int index) {
        visited[index] = true;
        for (int next : graph[index]) {
            if (!visited[next]) {
                recur(next);
            }
        }
    }
}