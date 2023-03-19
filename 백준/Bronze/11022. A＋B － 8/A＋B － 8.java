import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a, b, c;
        a = scanner.nextInt();
        StringBuilder result = new StringBuilder();

        for (int i = 1 ; i <= a ; i++) {
            b = scanner.nextInt();
            c = scanner.nextInt();
            result.append("Case #").append(i).append(": ")
                    .append(b).append(" + ").append(c).append(" = ").append((b + c));
            if (i != a) {
                result.append("\n");
            }
        }
        System.out.println(result);
    }
}