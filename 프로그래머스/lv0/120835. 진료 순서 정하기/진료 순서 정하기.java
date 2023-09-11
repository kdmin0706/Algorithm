import java.util.*;

class Solution {
    public int[] solution(int[] emergency) {
        List<Integer> list = new ArrayList<>();
        
        int[] arr = emergency.clone();
        Arrays.sort(arr);
        
        for (int i = 0; i < emergency.length; i++) {
            for(int j = 0; j < emergency.length; j++) {
                if(arr[j] == emergency[i]) {
                    list.add(emergency.length - j);
                    break;
                }
            }
        }        
        return list.stream().mapToInt(i -> i).toArray();
    }
}