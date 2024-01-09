import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.PriorityQueue;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer stringTokenizer = new StringTokenizer(bufferedReader.readLine());
        int V = Integer.parseInt(stringTokenizer.nextToken());
        int E = Integer.parseInt(stringTokenizer.nextToken());
        int K = Integer.parseInt(bufferedReader.readLine());
        ArrayList<Node>[] A = new ArrayList[V + 1];
        int[] dist = new int[V + 1];
        for (int i = 0; i <= V; i++) {
            A[i] = new ArrayList<>();
            dist[i] = Integer.MAX_VALUE;
        }
        for (int i = 0; i < E; i++) {
            stringTokenizer = new StringTokenizer(bufferedReader.readLine());
            int u = Integer.parseInt(stringTokenizer.nextToken());
            int v = Integer.parseInt(stringTokenizer.nextToken());
            int w = Integer.parseInt(stringTokenizer.nextToken());
            A[u].add(new Node(v, w));
        }
        PriorityQueue<Node> queue = new PriorityQueue<>((o1, o2) -> {
            if (o1.w == o2.w) {
                return o1.v - o2.v;
            }
            return o1.w - o2.w;
        });
        dist[K] = 0;
        queue.add(new Node(K, 0));
        while (!queue.isEmpty()) {
            Node node = queue.poll();
            ArrayList<Node> nodes = A[node.v];
            for (Node next : nodes) {
                if (dist[node.v] + next.w < dist[next.v]) {
                    dist[next.v] = dist[node.v] + next.w;
                    queue.add(new Node(next.v, dist[next.v]));
                }
            }
        }
        StringBuilder result = new StringBuilder();
        for (int i = 1; i <= V; i++) {
            if (dist[i] == Integer.MAX_VALUE) {
                result.append("INF");
            } else {
                result.append(dist[i]);
            }
            result.append("\n");
        }
        System.out.println(result);
    }

    public static class Node {
        public int v;
        public int w;

        public Node(int v, int w) {
            this.v = v;
            this.w = w;
        }
    }
}