import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a, b, c;
        a = scanner.nextInt();
        StringBuilder result = new StringBuilder();

        for (int i = 0 ; i < a ; i++) {
            b = scanner.nextInt();
            c = scanner.nextInt();
            result.append((b + c));
            if (i != a - 1) {
                result.append("\n");
            }
        }
        System.out.println(result);
    }
}