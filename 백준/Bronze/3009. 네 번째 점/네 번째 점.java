import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Map<Integer, Integer> x = new HashMap<>();
        Map<Integer, Integer> y = new HashMap<>();
        for (int i = 0; i < 3; i++) {
            int a = scanner.nextInt();
            int b = scanner.nextInt();
            x.put(a, x.getOrDefault(a, 0) + 1);
            y.put(b, y.getOrDefault(b, 0) + 1);
        }
        StringBuilder result = new StringBuilder();
        for (int key : x.keySet()) {
            if (x.get(key) == 1) {
                result.append(key).append(" ");
                break;
            }
        }
        for (int key : y.keySet()) {
            if (y.get(key) == 1) {
                result.append(key);
                break;
            }
        }
        System.out.println(result);
    }
}