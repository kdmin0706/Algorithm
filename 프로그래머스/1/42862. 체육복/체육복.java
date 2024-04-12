import java.util.*;
import java.util.stream.*;

class Solution {
    public int solution(int n, int[] lost, int[] reserve) {
        Arrays.sort(lost);
        Arrays.sort(reserve);
        
        //도난당한 경우 체크
        Set<Integer> set = Arrays.stream(lost)
            .boxed()
            .collect(Collectors.toSet());
        set.retainAll(Arrays.stream(reserve)
                     .boxed()
                     .collect(Collectors.toSet()));
        
        System.out.println("set : " + set);
        
        Queue<Integer> q = new LinkedList<>();
        for (int ints : lost) {
            q.add(ints);
        };
        
        int get = 0;    //빌린 학생 수
        for (int r : reserve) {
            //여벌의 체육복을 가지고 있는 학생이 잃어버린 경우
            if(set.contains(r)) {
                continue;
            }
            
            while (!q.isEmpty() && (q.peek() < r- 1 || set.contains(q.peek()))) {
                q.poll();
            }
            
            if(q.isEmpty()) {
                break;
            }
            
            if(q.peek() <= r + 1) {
                q.poll();
                get++;
            }
        }
        
        //전체학생수 - 체육복 도난당한 학생수 + 여벌 체육복이 있는 학생수 + 빌린 학생수
        return n - lost.length + set.size() + get;
    }
}