import java.util.*;

class Solution {
    public int[] solution(int[] array, int[][] commands) {
        int[] answer = new int[commands.length];
        
        for (int i = 0; i < answer.length; i++) {
            int[] command = commands[i];
            
            int from = command[0] - 1;
            int to = command[1];
            int k = command[2] - 1;
            
            //array에서 특정 구간 잘라내기
            int[] arr = Arrays.copyOfRange(array, from, to);
            
            //잘라낸 구간 정렬하기
            Arrays.sort(arr);
            
            //정렬된 배열에서 k번째 수 구하기
            answer[i] = arr[k];
        }
        
        return answer;
    }
}