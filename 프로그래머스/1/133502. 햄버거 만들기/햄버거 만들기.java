import java.util.*;

class Solution {
    public int solution(int[] ingredient) {      
        int answer = 0;
        Stack<Integer> stack = new Stack<>();

        for (int i : ingredient) {
            stack.add(i);

            // 스택의 사이즈가 4보다 크면 조건 처리 진행
            if (stack.size() >= 4) {
                
                // stack 값이 1,2,3,1이 연속으로 있는 경우
                if (stack.get(stack.size() - 4) == 1
                && stack.get(stack.size() - 3) == 2
                && stack.get(stack.size() - 2) == 3
                && stack.get(stack.size() - 1) == 1) {
                    
                    answer++;

                    for (int j = 0; j < 4; j++) {
                        stack.pop();
                    }
                }
            }
        }

        return answer;
    }
}