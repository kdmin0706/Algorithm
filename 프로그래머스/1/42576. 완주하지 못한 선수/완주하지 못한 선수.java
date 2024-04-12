import java.util.*;

class Solution {
    public String solution(String[] participant, String[] completion) {
        String answer = "";
        Map<String, Integer> hm = new HashMap<>();
        for (String p : participant) {
            hm.put(p, hm.getOrDefault(p, 0) + 1);
        }
        for (String s : completion) {
            hm.put(s, hm.get(s) - 1);
        }

//        System.out.print("map : " + hm);
        
        for (String key : hm.keySet()) {
            if (hm.get(key) != 0){
                answer = key;
                break;
            }
        }
        return answer;
    }
}