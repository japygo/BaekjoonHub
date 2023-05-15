import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String a = scanner.nextLine();
        Pattern pattern = Pattern.compile("c=|c-|dz=|d-|lj|nj|s=|z=|[a-zA-Z]");
        Matcher matcher = pattern.matcher(a);
        int cnt = 0;
        while (matcher.find()) {
            cnt++;
        }
        System.out.println(cnt);
    }
}