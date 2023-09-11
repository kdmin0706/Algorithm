import java.util.*;
import java.util.stream.*;

class Solution {
    public int[] solution(int[] array) {
        int max = Arrays.stream(array).max().getAsInt();
        int idx = -1;
        
        for(int i = 0; i < array.length; i++) {
            if(max == array[i]) {
                idx = i;
                break;
            }
        }
        
        return new int[] {max, idx};
    }
}