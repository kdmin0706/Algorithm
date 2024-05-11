import java.util.*;
class Solution {
    public long solution(long n) {
        String string = Long.toString(n);
        char[] chars = string.toCharArray();

        Arrays.sort(chars);

        StringBuilder sb = new StringBuilder(new String(chars));
        String s = sb.reverse().toString();

        return Long.parseLong(s);
    }
}