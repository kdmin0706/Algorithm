import java.util.*;

class Solution {
    public int[] solution(int n, long k) {        
        int[] answer = new int[n];
        List<Integer> list = new ArrayList<>();
        
        long f = 1;
        for(int i=1;i<=n;i++) {
            list.add(i);
            f *= i;
        }
        
        k--;
        
        for (int i = 0; i < n; i++) {
            f /= (n - i);
            int index = (int) (k / f);
            answer[i] = list.remove(index);
            k %= f;
        }
        
        
        return answer;
    }
}