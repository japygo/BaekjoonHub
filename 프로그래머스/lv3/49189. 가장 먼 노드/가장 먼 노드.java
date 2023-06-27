import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

class Solution {
    public int solution(int n, int[][] edge) {
        int answer = 0;
        boolean[] visited = new boolean[edge.length];
        ArrayList<Integer>[] arr = new ArrayList[edge.length];
        for (int i = 0; i < edge.length; i++) {
            arr[i] = new ArrayList<>();
            visited[i] = false;
        }
        for (int[] e : edge) {
            int a = e[0];
            int b = e[1];
            arr[a].add(b);
            arr[b].add(a);
        }

        Queue<Node> queue = new LinkedList<>();
        queue.add(new Node(1, 1));
        visited[1] = true;
        int max = Integer.MIN_VALUE;

        while (!queue.isEmpty()) {
            Node tmp = queue.poll();
            if (max < tmp.w) {
                max = tmp.w;
                answer = 0;
            }
            if (max == tmp.w) {
                answer++;
            }

            for (int i : arr[tmp.v]) {
                if (!visited[i]) {
                    queue.add(new Node(i, tmp.w + 1));
                    visited[i] = true;
                }
            }
        }
        return answer;
    }
}

class Node {
    int v;
    int w;

    Node(int v, int w) {
        this.v = v;
        this.w = w;
    }
}