import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < a; i++) {
            int b = scanner.nextInt();
            String c = scanner.next();
            for (String s : c.split("")) {
                result.append(s.repeat(b));
            }
            if (i < a - 1) {
                result.append("\n");
            }
        }
        System.out.println(result);
    }
}