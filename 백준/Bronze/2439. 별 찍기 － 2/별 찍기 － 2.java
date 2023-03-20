import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a;
        a = scanner.nextInt();
        StringBuilder result = new StringBuilder();

        for (int i = 1 ; i <= a ; i++) {
            result.append(" ".repeat(a - i)).append("*".repeat(i));
            if (i != a) {
                result.append("\n");
            }
        }
        System.out.println(result);
    }
}