import java.util.*;

class Solution {
    public int[] solution(int[] emergency) {
        List<Integer> list = new ArrayList<>();
        
        int[] answer = Arrays.copyOf(emergency, emergency.length);
        Arrays.sort(emergency);
        
        for (int i = 0; i < emergency.length; i++) {
            for (int j = 0; j < emergency.length; j++) {
                if (answer[j] == emergency[i]) {
                    list.add(emergency.length - j);
                    break;
                }
            }
        }        
        
        
        return list.stream().mapToInt(Integer::new).toArray();
    }
}