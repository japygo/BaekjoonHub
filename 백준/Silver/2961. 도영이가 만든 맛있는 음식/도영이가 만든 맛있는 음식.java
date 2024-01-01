import java.util.Scanner;

public class Main {
    static long result = Integer.MAX_VALUE;
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int[][] arr = new int[N][2];
        for (int i = 0; i < N; i++) {
            arr[i][0] = scanner.nextInt();
            arr[i][1] = scanner.nextInt();
        }
        recur(0, 1, 0, arr, N);
        System.out.println(result);
    }

    public static void recur(int index, int S, int B, int[][] arr, int N) {
        if (index == N) {
            if (S == 1 && B == 0) {
                return;
            }
            result = Math.min(result, Math.abs(S - B));
            return;
        }
        recur(index + 1, S * arr[index][0], B + arr[index][1], arr, N);
        recur(index + 1, S, B, arr, N);
    }
}