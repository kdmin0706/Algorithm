import java.util.*;

class Solution {
    public int solution(int[] arr1, int[] arr2) {
        
        int first = Arrays.stream(arr1).sum();
        int second = Arrays.stream(arr2).sum();
        
        if (arr1.length != arr2.length) {
            return arr1.length > arr2.length ? 1 : -1;
        } else if (first == second) {
                return 0;
        }
        
        return first > second ? 1 : -1;
    }
}