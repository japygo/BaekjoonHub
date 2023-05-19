import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = 0;
        int cnt = 0;
        while (b < a) {
            cnt++;
            b += cnt;
        }

        int left = 0;
        int right = 0;
        if (cnt % 2 == 0) {
            left = cnt - (b - a);
            right = 1 + (b - a);
        } else {
            left = 1 + (b - a);
            right = cnt - (b - a);
        }
        System.out.println(left + "/" + right);
    }
}