import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws Exception {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer stringTokenizer = new StringTokenizer(bufferedReader.readLine());
        StringBuilder result = new StringBuilder();
        int n = Integer.parseInt(stringTokenizer.nextToken());
        int m = Integer.parseInt(stringTokenizer.nextToken());
        int[] arr = new int[n + 1];
        for (int i = 0; i < n + 1; i++) {
            arr[i] = i;
        }
        for (int i = 0; i < m; i++) {
            stringTokenizer = new StringTokenizer(bufferedReader.readLine());
            int command = Integer.parseInt(stringTokenizer.nextToken());
            int a = Integer.parseInt(stringTokenizer.nextToken());
            int b = Integer.parseInt(stringTokenizer.nextToken());
            if (command == 0) {
                union(a, b, arr);
            } else {
                a = find(a, arr);
                b = find(b, arr);
                if (a == b) {
                    result.append("YES");
                } else {
                    result.append("NO");
                }
                if (i < m - 1) {
                    result.append("\n");
                }
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