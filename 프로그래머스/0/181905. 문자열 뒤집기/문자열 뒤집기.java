import java.util.*;

class Solution {
    public String solution(String my_string, int s, int e) {
        Stack<Character> stack = new Stack<>();
        StringBuilder sb = new StringBuilder();
        
        for(int i = 0; i < my_string.length(); i++) {
            if(i >= s && i <= e) {
                stack.add(my_string.charAt(i));
            }
        }
        
        for(int i = 0; i < my_string.length(); i++) {
            if(i >= s && i <= e) {
                sb.append(stack.pop());
            } else {
                sb.append(my_string.charAt(i));
            }
        }
        
        return sb.toString();
    }
}