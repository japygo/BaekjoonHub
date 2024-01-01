import java.util.Scanner;

public class Main {
    static StringBuilder result = new StringBuilder();
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int M = scanner.nextInt();
        int[] arr = new int[M];
        recur(0, arr, N, M);
        System.out.println(result);
    }

    public static void recur(int count, int[] arr, int N, int M) {
        if (count == M) {
            for (int i = 0; i < M; i++) {
                result.append(arr[i]);
                if (i != M - 1) {
                    result.append(" ");
                }
            }
            result.append("\n");
            return;
        }
        for (int i = count; i < N; i++) {
            int tmp = i + 1;
            boolean isContain = false;
            for (int j : arr) {
                if (j >= tmp) {
                    isContain = true;
                    break;
                }
            }
            if (isContain) {
                continue;
            }
            arr[count] = tmp;
            recur(count + 1, arr, N, M);
            arr[count] = 0;
        }
    }
}