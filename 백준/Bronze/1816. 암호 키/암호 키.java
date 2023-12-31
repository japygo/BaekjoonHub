import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        for (int i = 0; i < N; i++) {
            long num = scanner.nextLong();
            for (int j = 2; j <= 1_000_000; j++) {
                if (num % j == 0) {
                    System.out.println("NO");
                    break;
                }
                if (j == 1_000_000) {
                    System.out.println("YES");
                }
            }
        }
    }
}