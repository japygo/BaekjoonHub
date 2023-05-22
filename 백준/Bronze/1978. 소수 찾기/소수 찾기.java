import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int cnt = 0;
        for (int i = 0; i < a; i++) {
            int b = scanner.nextInt();
            if (isSosu(b)) {
                cnt++;
            }
        }
        System.out.println(cnt);
    }

    private static boolean isSosu(int num) {
        if (num == 1) {
            return false;
        }
        for (int i = 2; i < num; i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }
}