import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < a; i++) {
            String b = scanner.next();
            result.append(b.charAt(0)).append(b.charAt(b.length() - 1));
            if (i != a - 1) {
                result.append("\n");
            }
        }
        System.out.println(result);
    }
}