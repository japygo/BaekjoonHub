import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

class Solution {
    int length;
    Set<Integer> set;
    String[] array;

    public int solution(String numbers) {
        int answer = 0;
        length = numbers.length();
        set = new HashSet<>();
        array = numbers.split("");
        recur(0, new ArrayList<>());

        answer = set.size();
        
        return answer;
    }
    
    private void recur(int index, List<Integer> indexList) {
        if (index >= length) {
            if (indexList.isEmpty()) {
                return;
            }
            StringBuilder value = new StringBuilder();
            for (Integer i : indexList) {
                value.append(array[i]);
            }
            int intValue = Integer.parseInt(value.toString());
            if (!set.contains(intValue) && isPrime(intValue)) {
                set.add(intValue);
            }
            return;
        }
        for (int i = 0; i < length; i++) {
            if (indexList.contains(i)) {
                continue;
            }
            recur(index + 1, indexList);
            indexList.add(i);
            recur(index + 1, indexList);
            indexList.remove((Integer) i);
        }
    }
    
    private boolean isPrime(int number) {
        if (number < 2) {
            return false;
        }
        for (int i = 2; i * i <= number; i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }
}