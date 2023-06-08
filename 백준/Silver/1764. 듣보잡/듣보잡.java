import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer stringTokenizer = new StringTokenizer(bufferedReader.readLine());
        int n = Integer.parseInt(stringTokenizer.nextToken());
        int m = Integer.parseInt(stringTokenizer.nextToken());
        Map<String, Integer> map = new HashMap<>();
        for (int i = 0; i < n; i++) {
            String name = bufferedReader.readLine();
            map.put(name, 1);
        }
        int cnt = 0;
        List<String> list = new ArrayList<>();
        for (int i = 0; i < m; i++) {
            String name = bufferedReader.readLine();
            if (map.containsKey(name)) {
                cnt++;
                list.add(name);
            }
        }
        System.out.println(cnt);
        list.stream().sorted().forEach(System.out::println);
    }
}