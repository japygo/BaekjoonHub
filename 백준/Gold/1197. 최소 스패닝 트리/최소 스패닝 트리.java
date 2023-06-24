import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws Exception {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer stringTokenizer = new StringTokenizer(bufferedReader.readLine());
        int v = Integer.parseInt(stringTokenizer.nextToken());
        int e = Integer.parseInt(stringTokenizer.nextToken());
        int[] arr = new int[v + 1];
        for (int i = 1; i <= v; i++) {
            arr[i] = i;
        }
        List<Edge> list = new ArrayList<>();
        for (int i = 1; i <= e; i++) {
            stringTokenizer = new StringTokenizer(bufferedReader.readLine());
            int a = Integer.parseInt(stringTokenizer.nextToken());
            int b = Integer.parseInt(stringTokenizer.nextToken());
            int c = Integer.parseInt(stringTokenizer.nextToken());
            list.add(new Edge(a, b, c));
        }
        list.sort(Comparator.comparingInt(o -> o.w));

        long result = 0;
        int cnt = 0;
        for (Edge edge : list) {
            if (find(edge.s, arr) != find(edge.e, arr)) {
                union(edge.s, edge.e, arr);
                cnt++;
                result += edge.w;
            }
            if (cnt == v - 1) {
                break;
            }
        }
        System.out.println(result);
    }

    private static void union(int a, int b, int[] arr) {
        a = find(a, arr);
        b = find(b, arr);
        if (a < b) {
            arr[b] = a;
        } else if (a > b) {
            arr[a] = b;
        }
    }

    private static int find(int a, int[] arr) {
        if (a == arr[a]) {
            return a;
        }
        arr[a] = find(arr[a], arr);
        return arr[a];
    }
}

class Edge {
    int s;
    int e;
    int w;

    public Edge(int s, int e, int w) {
        this.s = s;
        this.e = e;
        this.w = w;
    }
}