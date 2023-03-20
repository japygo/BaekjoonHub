import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a, b;
        StringBuilder result = new StringBuilder();

        while (scanner.hasNextInt()) {
            a = scanner.nextInt();
            b = scanner.nextInt();
            result.append((a + b));
            if (!scanner.hasNextInt()) {
                break;
            }
            result.append("\n");
        }
        System.out.println(result);
    }
}