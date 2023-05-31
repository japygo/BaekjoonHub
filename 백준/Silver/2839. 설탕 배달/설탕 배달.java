import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int cnt = -1;
        for (int i = 0; i <= n / 3; i++) {
            for (int j = 0; j <= n / 5; j++) {
                if (3 * i + 5 * j == n) {
                    if (cnt == -1 || cnt > i + j) {
                        cnt = i + j;
                    }
                }
            }
        }
        System.out.println(cnt);
    }
}