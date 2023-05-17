import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[][] arr = new int[100][100];
        for (int i = 0; i < 100; i++) {
            Arrays.fill(arr[i], 0);
        }
        int a = scanner.nextInt();
        for (int i = 0; i < a; i++) {
            int b = scanner.nextInt() - 1;
            int c = scanner.nextInt() - 1;
            for (int j = b; j < b + 10; j++) {
                for (int k = c; k < c + 10; k++) {
                    arr[j][k] = 1;
                }
            }
        }
        int sum = 0;
        for (int i = 0; i < 100; i++) {
            for (int j = 0; j < 100; j++) {
                if (arr[i][j] == 1) {
                    sum++;
                }
            }
        }
        System.out.println(sum);
    }
}