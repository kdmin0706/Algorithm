import java.util.*;

class Solution {
    public int[] solution(String[] keymap, String[] targets) {
        int[] answer = new int[targets.length];
        Map<Character, Integer> map = new HashMap<>();
        
        for(int i=0;i<keymap.length;i++) {
            for(int j=0;j<keymap[i].length();j++) {
                char c = keymap[i].charAt(j);
                
                if(map.containsKey(c)) {
                    int idx = map.get(c);
                    map.put(c, Math.min(idx, j + 1));
                } else {
                    map.put(c, j + 1);
                }
            }
        }
        
        for (int i=0;i<targets.length;i++) {
            String s = targets[i];
            int cnt = 0;
            boolean isTrue = true;
            
            for (char c : s.toCharArray()) {
                if(map.containsKey(c)) {
                    cnt += map.get(c);
                } else {
                    isTrue = false;
                    break;
                }
            }
            
            answer[i] = !isTrue ? -1 : cnt;
        }
        
        return answer;
    }
}