import java.util.*;

class Solution {
    public int solution(int[] array) {
        int count = 0;
        int answer = 0;

        Map<Integer, Integer> map = new HashMap<>();
        for (int ints : array) {
            map.put(ints, map.getOrDefault(ints, 0) + 1);
        }

        int max = Collections.max(map.values());
        for (Map.Entry<Integer, Integer> m : map.entrySet()) {
            if (m.getValue() == max) {
                count++;
                answer = m.getKey();
            }
        }


        return count > 1 ? -1 : answer;
    }
}