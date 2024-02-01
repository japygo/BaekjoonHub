import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String word = bufferedReader.readLine();
        String bomb = bufferedReader.readLine();
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < word.length(); i++) {
            stack.push(word.charAt(i));
            if (bomb.length() > stack.size()) {
                continue;
            }
            boolean isSame = true;
            for (int j = 0; j < bomb.length(); j++) {
                if (stack.get(stack.size() - bomb.length() + j) != bomb.charAt(j)) {
                    isSame = false;
                    break;
                }
            }
            if (isSame) {
                for (int j = 0; j < bomb.length(); j++) {
                    stack.pop();
                }
            }
        }
        if (stack.isEmpty()) {
            System.out.println("FRULA");
        } else {
            StringBuilder result = new StringBuilder();
            for (Character character : stack) {
                result.append(character);
            }
            System.out.println(result);
        }
    }
}