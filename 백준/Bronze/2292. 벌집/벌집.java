import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int cnt = 1;
        int n = 1;
        while (n < a) {
            n += 6 * cnt++;
        }
        System.out.println(cnt);
    }
}