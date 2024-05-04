import java.util.*;

class Solution {
    public int[] solution(String s) {
        int[] answer = new int[s.length()];
        
        // 각 문자의 마지막 위치를 저장할 배열 초기화. 
        // ASCII 문자를 가정하고, 모든 위치를 -1로 설정
        int[] lastPositions = new int[128];
        Arrays.fill(lastPositions, -1);

        for (int i=0;i<answer.length;i++) {
            char currentChar = s.charAt(i);
            
            // 현재 문자의 마지막 위치와 현재 위치의 차이를 계산
            if (lastPositions[currentChar] == -1) {
                answer[i] = -1; // 처음 나온 문자일 경우 -1 저장
            } else {
                answer[i] = i - lastPositions[currentChar]; // 아닐 경우 차이 저장
            }
            
            // 현재 문자의 마지막 위치를 업데이트
            lastPositions[currentChar] = i;
        }
        
        return answer;
    }
}