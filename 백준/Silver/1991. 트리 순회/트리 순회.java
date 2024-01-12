import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;

public class Main {
    static Map<String, String[]> graph;
    static StringBuilder preorder;
    static StringBuilder inorder;
    static StringBuilder postorder;
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer stringTokenizer = new StringTokenizer(bufferedReader.readLine());
        int N = Integer.parseInt(stringTokenizer.nextToken());
        preorder = new StringBuilder();
        inorder = new StringBuilder();
        postorder = new StringBuilder();
        graph = new HashMap<>();
        for (int i = 0; i < N; i++) {
            stringTokenizer = new StringTokenizer(bufferedReader.readLine());
            String first = stringTokenizer.nextToken();
            String second = stringTokenizer.nextToken();
            String third = stringTokenizer.nextToken();
            graph.put(first, new String[] { second, third });
        }
        recur("A");

        System.out.println(preorder);
        System.out.println(inorder);
        System.out.println(postorder);
    }

    public static void recur(String node) {
        if (node.equals(".")) {
            return;
        }

        preorder.append(node);
        recur(graph.get(node)[0]);
        inorder.append(node);
        recur(graph.get(node)[1]);
        postorder.append(node);
    }
}