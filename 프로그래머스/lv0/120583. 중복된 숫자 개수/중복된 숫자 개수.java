import java.util.*;

class Solution {
    public int solution(int[] array, int n) {
        Map<Integer, Integer> map = new HashMap<>();
        
        for (int i : array) {
            map.put(i, map.getOrDefault(i, 0) + 1);
        }
        
        for (int i : map.keySet()) {
            if(i == n) {
                return map.get(i);
            }
        }
        
        return 0;
    }
}