import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String a = scanner.nextLine();

        Map<String, Integer> map = new HashMap<>();
        for (String s : a.toUpperCase().split("")) {
            map.merge(s, 1, Integer::sum);
        }
        int max = 0;
        String b = "";
        for (String key : map.keySet()) {
            int num = map.get(key);
            if (max < num) {
                max = num;
                b = key;
            }
        }
        for (String key : map.keySet()) {
            if (key.equals(b)) {
                continue;
            }
            int num = map.get(key);
            if (max == num) {
                b = "?";
                break;
            }
        }
        System.out.println(b);
    }
}