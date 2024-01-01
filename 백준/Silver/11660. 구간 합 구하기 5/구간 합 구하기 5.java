import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int M = scanner.nextInt();
        int[][] arr = new int[N][N];
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                arr[i][j] = scanner.nextInt();
            }
        }
        int[][] prefix = new int[N + 1][N + 1];
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                prefix[j + 1][i + 1] = prefix[j][i + 1] + prefix[j + 1][i] - prefix[j][i] + arr[j][i];
            }
        }
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < M; i++) {
            int x1 = scanner.nextInt();
            int y1 = scanner.nextInt();
            int x2 = scanner.nextInt();
            int y2 = scanner.nextInt();
            int answer = prefix[x2][y2] - prefix[x2][y1 - 1] - prefix[x1 - 1][y2] + prefix[x1 - 1][y1 - 1];
            result.append(answer);
            if (i != M - 1) {
                result.append("\n");
            }
        }
        System.out.println(result);
    }
}