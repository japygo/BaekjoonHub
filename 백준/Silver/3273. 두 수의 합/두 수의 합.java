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
        int x = scanner.nextInt();
        int s = 0;
        int e = n - 1;
        int cnt = 0;
        while (s < e) {
            if (arr[s] + arr[e] == x) {
                cnt += 1;
            }
            if (arr[s] + arr[e] >= x) {
                e -= 1;
            } else {
                s += 1;
            }
        }
        System.out.println(cnt);
    }
}