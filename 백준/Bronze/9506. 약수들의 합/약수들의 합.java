import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            int a = scanner.nextInt();
            if (a == -1) {
                break;
            }
            List<Integer> list = new ArrayList<>();
            int sum = 0;
            for (int i = 1; i < a; i++) {
                if (a % i == 0) {
                    sum += i;
                    list.add(i);
                }
            }
            StringBuilder result = new StringBuilder();
            if (sum == a) {
                result.append(a).append(" = ");
                for (int i = 0; i < list.size(); i++) {
                    result.append(list.get(i));
                    if (i < list.size() - 1) {
                        result.append(" + ");
                    }
                }
                System.out.println(result);
            } else {
                System.out.println(a + " is NOT perfect.");
            }
        }
    }
}