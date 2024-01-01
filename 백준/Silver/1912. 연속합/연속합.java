import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }
        int[] prefix = new int[n + 1];
        Arrays.fill(prefix, 0);
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < n; i++) {
            prefix[i + 1] = Math.max(prefix[i] + arr[i], arr[i]);
            max = Math.max(max, prefix[i + 1]);
        }
        System.out.println(max);
    }
}