import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

class Solution {
    public int solution(int n, int[][] computers) {
        int answer = 0;
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = i;
        }

        for (int i = 0; i < computers.length; i++) {
            for (int j = 0; j < computers.length; j++) {
                if (i != j) {
                    int computer = computers[i][j];
                    if (computer == 1) {
                        union(i, j, arr);
                    }
                }
            }
        }

        Set<Integer> set = new HashSet<>();
        for (int i = 0; i < n; i++) {
            set.add(find(i, arr));
        }
        answer = set.size();
        return answer;
    }

    private void union(int a, int b, int[] arr) {
        a = find(a, arr);
        b = find(b, arr);
        if (a < b) {
            arr[b] = a;
        } else if (a > b) {
            arr[a] = b;
        }
    }

    private int find(int a, int[] arr) {
        if (a == arr[a]) {
            return a;
        }
        arr[a] = find(arr[a], arr);
        return arr[a];
    }
}