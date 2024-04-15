import java.util.*;
class Solution {
    public String solution(String X, String Y) {
        Map<Integer, Integer> mapX = new HashMap<>();
        for (char c : X.toCharArray()) {
            int num = c - '0';
            mapX.put(num, mapX.getOrDefault(num, 0) + 1);
        }
        
        Map<Integer, Integer> mapY = new HashMap<>();
        for (char c : Y.toCharArray()) {
            int num = c - '0';
            mapY.put(num, mapY.getOrDefault(num, 0) + 1);
        }

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < 10; i++) {
            if(mapX.containsKey(i) && mapY.containsKey(i)) {
                int min = Math.min(mapX.get(i), mapY.get(i));
                
                for (int j = 0; j < min; j++) {
                    sb.append(i);
                }
            }
        }
        
        if(sb.reverse().toString().startsWith("0")) {
            return "0";
        } else if (sb.toString().isEmpty()) {
            return "-1";
        }
        
        return sb.toString();
        
    }
}