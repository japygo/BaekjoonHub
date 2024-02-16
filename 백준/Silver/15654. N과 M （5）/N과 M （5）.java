import java.util.Arrays;
import java.util.Scanner;

public class Main {
    static StringBuilder result = new StringBuilder();
    static int[] nums;
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int M = scanner.nextInt();
        nums = new int[N];
        for (int i = 0; i < N; i++) {
            nums[i] = scanner.nextInt();
        }
        Arrays.sort(nums);
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
        for (int i = 0; i < N; i++) {
            boolean isContain = false;
            for (int j : arr) {
                if (j == nums[i]) {
                    isContain = true;
                    break;
                }
            }
            if (isContain) {
                continue;
            }
            arr[count] = nums[i];
            recur(count + 1, arr, N, M);
            arr[count] = 0;
        }
    }
}