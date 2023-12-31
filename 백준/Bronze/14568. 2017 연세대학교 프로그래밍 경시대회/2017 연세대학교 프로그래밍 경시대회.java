import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int count = 0;
        for (int i = 1; i <= N; i++) {
            for (int j = 1; j <= N; j++) {
                for (int k = 1; k <= N; k++) {
                    if (i + j + k == N &&
                            k >= j + 2 &&
                            i % 2 == 0) {
                        count++;
                    }
                }
            }
        }
        System.out.println(count);
    }
}