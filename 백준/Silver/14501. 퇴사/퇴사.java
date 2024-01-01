import java.util.Scanner;

public class Main {
    static int result;
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int[][] arr = new int[N][2];
        for (int i = 0; i < N; i++) {
            arr[i][0] = scanner.nextInt();
            arr[i][1] = scanner.nextInt();
        }
        recur(0, 0, arr, N);
        System.out.println(result);
    }

    public static void recur(int index, int price, int[][] arr, int N) {
        if (index == N) {
            result = Math.max(result, price);
            return;
        }

        if (index > N) {
            return;
        }

        recur(index + arr[index][0], price + arr[index][1], arr, N);
        recur(index + 1, price, arr, N);
    }
}