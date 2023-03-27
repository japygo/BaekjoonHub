import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String a;
        StringBuilder result = new StringBuilder();
        while (scanner.hasNextLine()) {
            a = scanner.nextLine();
            result.append(a);
            if (!scanner.hasNextLine()) {
                break;
            }
            result.append("\n");
        }
        System.out.println(result);
    }
}