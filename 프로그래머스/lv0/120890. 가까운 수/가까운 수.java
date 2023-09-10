import java.util.*;

class Solution {
    public int solution(int[] array, int n) {
        Arrays.sort(array);
        
        int min = Integer.MAX_VALUE;
        int answer = 0;
        
        for (int i = 0; i < array.length; i++) {
            int a = (int)Math.abs(array[i] - n);
            
            if(min > a) {
                min = a;
                answer = array[i];
            } else if (min == a && answer > array[i]) {
                min = a;
                answer = array[i];
            }
        }

        return answer;
    }
}