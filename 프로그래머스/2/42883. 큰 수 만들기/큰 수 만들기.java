import java.util.*;
import java.util.stream.*;

class Solution {
    public String solution(String number, int k) {
        Stack<Character> stack = new Stack<>();
        
        for (char c : number.toCharArray()) {
    
            while(k > 0 && !stack.isEmpty() && c > stack.peek()) {
                stack.pop();
                k--;
            }
            
            stack.push(c);
        }
        
//        System.out.println("stack :" + stack);
        
        //제거해야할 k 값이 0보다 크면 맨앞자리 제거
        while(k-- > 0) {
            stack.pop();
        }
        
        return stack.stream()
            .map(String::valueOf)
            .collect(Collectors.joining());
    }
}