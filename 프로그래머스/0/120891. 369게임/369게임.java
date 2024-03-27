import java.util.*;

class Solution {
    public int solution(int order) {
        int answer = 0;
        String s = Integer.toString(order);
        
        for (Character c : s.toCharArray()) {
            if (c == '3' || c == '6' || c == '9') {
                answer++;
            }
        }
        
        
        return answer;
    }
}