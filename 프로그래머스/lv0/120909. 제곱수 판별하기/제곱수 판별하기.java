import java.util.*;

class Solution {
    public int solution(int n) {
        int answer = 1;
        while(true){
            int result = (int)Math.pow(answer,2);
            
            if(result == n){
                answer = 1;
                break;
            } else if(result > n){
                answer = 2;
                break;
            }
            
            answer++;
        }
        
        
        return answer;
    }
}