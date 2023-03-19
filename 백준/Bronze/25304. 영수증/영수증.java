import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int total, a, b, c;
        total = scanner.nextInt();
        a = scanner.nextInt();
        int sum = 0;

        for (int i = 0 ; i < a ; i++) {
            b = scanner.nextInt();
            c = scanner.nextInt();
            sum += b * c;
        }
        if (sum == total) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}