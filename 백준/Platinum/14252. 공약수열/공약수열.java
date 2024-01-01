import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int[] A = new int[N];
        for (int i = 0; i < N; i++) {
            A[i] = scanner.nextInt();
        }
        Arrays.sort(A);
        int count = 0;
        for (int i = 0; i < N - 1; i++) {
            int a = A[i];
            int b = A[i + 1];
            if (gcd(a, b) == 1) {
                continue;
            }
            for (int j = a; j < b; j++) {
                if (gcd(a, j) == 1 && gcd(b, j) == 1) {
                    count += 1;
                    break;
                }
                if (j == b - 1) {
                    count += 2;
                }
            }
        }
        System.out.println(count);
    }

    public static int gcd(int a, int b) {
        while (a % b != 0) {
            int tmp = a % b;
            a = b;
            b = tmp;
        }
        return b;
    }
}