import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer stringTokenizer = new StringTokenizer(bufferedReader.readLine());
        int a = Integer.parseInt(stringTokenizer.nextToken());
        int b = Integer.parseInt(stringTokenizer.nextToken());
        Map<String, Integer> map = new HashMap<>();
        stringTokenizer = new StringTokenizer(bufferedReader.readLine());
        for (int i = 0; i < a; i++) {
            String num = stringTokenizer.nextToken();
            Integer element = map.get(num);
            if (element != null) {
                map.remove(num);
            } else {
                map.put(num, 1);
            }
        }
        stringTokenizer = new StringTokenizer(bufferedReader.readLine());
        for (int i = 0; i < b; i++) {
            String num = stringTokenizer.nextToken();
            Integer element = map.get(num);
            if (element != null) {
                map.remove(num);
            } else {
                map.put(num, 1);
            }
        }
        System.out.println(map.values().size());
    }
}