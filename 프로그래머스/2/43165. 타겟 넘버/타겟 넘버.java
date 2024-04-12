import java.util.*;
class Solution {
    private static class State {
        public final int idx;
        public final int acc;
        
        State(int idx, int acc) {
            this.idx = idx;
            this.acc = acc;
        }
    }
    
    public int solution(int[] numbers, int target) {
        Stack<State> stack = new Stack<>();
        stack.add(new State(0, 0));
        
        int count = 0;
        while(!stack.isEmpty()) {
            State state = stack.pop();
            
            if(state.idx == numbers.length) {
                if (state.acc == target) {
                    count++;
                }
                continue;
            }
            
            // (+)를 선택한 경우
            stack.push(new State(state.idx + 1, state.acc - numbers[state.idx]));
            // (-)를 선택한 경우
            stack.push(new State(state.idx + 1, state.acc + numbers[state.idx]));
        }
        
        return count;
    }
}