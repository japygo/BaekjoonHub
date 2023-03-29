import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int k = scanner.nextInt();
        int q = scanner.nextInt();
        int l = scanner.nextInt();
        int b = scanner.nextInt();
        int n = scanner.nextInt();
        int p = scanner.nextInt();
        StringBuilder result = new StringBuilder();
        result.append(1 - k).append(" ")
                .append(1 - q).append(" ")
                .append(2 - l).append(" ")
                .append(2 - b).append(" ")
                .append(2 - n).append(" ")
                .append(8 - p);
        System.out.println(result);
    }
}