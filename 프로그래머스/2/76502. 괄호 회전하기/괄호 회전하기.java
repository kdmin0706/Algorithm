import java.util.*;

class Solution {
    private boolean isCorrect(char[] chars, int offset) {
        Stack<Character> stack = new Stack<>();
        
        for (int i = 0; i < chars.length; i++) {
            char c = chars[(offset + i) % chars.length];
            switch(c) {
                case '(':
                    stack.push(')');
                    break;
                case '{':
                    stack.push('}');
                    break;
                case '[':
                    stack.push(']');
                    break;
                case ')',']','}':
                    if (stack.isEmpty()) {
                       return false; 
                    }
                    if (stack.pop() != c) {
                        return false;
                    }
            }
        }
        return stack.isEmpty();
    }
    
    public int solution(String s) {
        char[] c = s.toCharArray();
        
        int count = 0;
        for (int i = 0; i < c.length; i++) {
            if (isCorrect(c, i)) {
                count++;
            }
        }
        return count;
    }
}