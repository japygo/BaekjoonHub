import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int[][] checkers = new int[N][2];
        int[] result = new int[N];
        int[] xArr = new int[N];
        int[] yArr = new int[N];
        for (int i = 0; i < N; i++) {
            int x = scanner.nextInt();
            int y = scanner.nextInt();
            checkers[i][0] = x;
            checkers[i][1] = y;
            xArr[i] = x;
            yArr[i] = y;
            result[i] = Integer.MAX_VALUE;
        }

        for (int i : xArr) {
            for (int j : yArr) {
                int[] dist = new int[N];
                for (int k = 0; k < N; k++) {
                    int x = checkers[k][0];
                    int y = checkers[k][1];
                    dist[k] = Math.abs(x - i) + Math.abs(y - j);
                }

                Arrays.sort(dist);

                int tmp = 0;
                for (int k = 0; k < N; k++) {
                    tmp += dist[k];
                    result[k] = Math.min(tmp, result[k]);
                }
            }
        }
        System.out.println(Arrays.stream(result)
                .mapToObj(String::valueOf)
                .collect(Collectors.joining(" ")));
    }
}