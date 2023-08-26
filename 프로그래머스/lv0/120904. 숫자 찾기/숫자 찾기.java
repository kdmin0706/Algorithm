import java.util.*;

class Solution {
    public int solution(int num, int k) {
        int answer = 0;
        String sNum = Integer.toString(num);
        for (int i = 0; i < sNum.length(); i++) {
            if(Integer.toString(k).equals(Character.toString(sNum.charAt(i)))){
                answer = i + 1;
                break;
            }
        }
        
        return answer == 0 ? -1 : answer;
    }
}