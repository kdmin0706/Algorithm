import java.util.*;

class Solution {
    public int[] solution(int[] arr) {
        
        int start = -1;
        int end = -1;
        
        for (int i = 0; i < arr.length; i++) {
             if(arr[i] == 2) {
                start = i;
                break;
            }
         }
        
        for (int i = arr.length - 1; i > -1; i--) {
            if(arr[i] == 2) {
                end = i;
                break;
            }
        }
        
        if (start == -1 && end == -1) {
            return new int[]{-1};
        } else {
            //copyOfRange의 마지막 인덱스는 -1 이 되기 때문에 +1 처리
            return Arrays.copyOfRange(arr, start, end + 1);
        }
    }
}