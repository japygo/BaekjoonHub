import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a, b;
        a = scanner.nextInt();
        b = scanner.nextInt();
        StringBuilder result = new StringBuilder();

        while (true) {
            result.append((a + b));
            a = scanner.nextInt();
            b = scanner.nextInt();
            if (a == 0 && b == 0) {
                break;
            }
            result.append("\n");
        }
        System.out.println(result);
    }
}