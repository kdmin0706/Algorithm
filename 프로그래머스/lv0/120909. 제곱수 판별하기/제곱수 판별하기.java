import java.util.*;

class Solution {
    public int solution(int n) {
        
        //방법 1
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
        
        //방법2
        if(n % Math.sqrt(n) == 0){
            answer = 1;
        } else{
            answer = 2;
        }
        
        return answer;
    }
}