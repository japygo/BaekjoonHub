import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String a = scanner.next();
        StringBuilder result = new StringBuilder();
        for (int i = 97; i <= 122; i++) {
            result.append(a.indexOf((char) i));
            if (i < 122) {
                result.append(" ");
            }
        }
        System.out.println(result);
    }
}