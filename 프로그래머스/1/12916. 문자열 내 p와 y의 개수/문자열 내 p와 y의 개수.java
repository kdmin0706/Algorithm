import java.util.*;

class Solution {
    boolean solution(String s) {
        s = s.toLowerCase();

        Map<Character, Integer> map = new HashMap<>();
        for(Character c : s.toCharArray()) {
            map.put(c, map.getOrDefault(c, 0) + 1);
        }
        System.out.println(map);

        if(map.get('p') == map.get('y'))
            return true;
        else
            return false;
    }
}