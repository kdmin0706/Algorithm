import java.util.*;

class Solution {
    public String solution(String s) {
        String answer = "";
        String[] sArr = s.split("");

        HashMap<String, Integer> hashmap = new HashMap<>();
        
        for(int i = 0; i < sArr.length; i++){
            hashmap.put(sArr[i], hashmap.getOrDefault(sArr[i],0) + 1);
        }
    
        for(Map.Entry<String, Integer> map : hashmap.entrySet()){
            if(map.getValue() == 1){
                answer += map.getKey();
            }
        }

        char[] c = answer.toCharArray();
        Arrays.sort(c);
        answer = new String(c);

        return answer;
    }
}