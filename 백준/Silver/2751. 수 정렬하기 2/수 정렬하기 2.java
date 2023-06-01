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
        Arrays.sort(arr);
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < n; i++) {
            result.append(arr[i]);
            if (i < n - 1) {
                result.append("\n");
            }
        }
        System.out.println(result);
    }
}