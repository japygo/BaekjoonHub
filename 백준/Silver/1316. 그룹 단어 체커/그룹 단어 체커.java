import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int cnt = 0;
        for (int i = 0; i < a; i++) {
            String b = scanner.next();
            boolean isGroup = false;
            Set<String> set = new HashSet<>();
            String before = "";
            for (String s : b.split("")) {
                if (!before.equals(s)) {
                    if (set.contains(s)) {
                        isGroup = true;
                        break;
                    }
                    before = s;
                    set.add(s);
                }
            }
            if (!isGroup) {
                cnt++;
            }
        }
        System.out.println(cnt);
    }
}