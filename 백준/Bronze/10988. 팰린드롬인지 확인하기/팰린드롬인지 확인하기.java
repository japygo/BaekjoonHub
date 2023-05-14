import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String a = scanner.nextLine();

        List<String> tmp = Arrays.asList(a.split(""));
        Collections.reverse(tmp);
        String b = String.join("", tmp);

        if (a.equals(b)) {
            System.out.println(1);
        } else {
            System.out.println(0);
        }
    }
}