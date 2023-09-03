import java.util.*;
import java.util.stream.*;

class Solution {
    public int solution(String message) {
        String[] s1 = message.split("");
        return s1.length * 2;
    }
}