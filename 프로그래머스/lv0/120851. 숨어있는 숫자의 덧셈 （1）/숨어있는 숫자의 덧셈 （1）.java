import java.util.*;

class Solution {
    public int solution(String my_string) {
        int answer = 0;
        for(char c : my_string.toCharArray()) {
            if (c >= 'A' && c <= 'Z' || c >= 'a' && c <= 'z') {
                continue;
            } else {
               answer += (int)c - '0'; 
            }
        }
        
        return answer;
    }
}