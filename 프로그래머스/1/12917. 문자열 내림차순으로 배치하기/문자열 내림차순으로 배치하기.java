import java.util.*;
class Solution {
    public String solution(String s) {
        String[] strings = s.split("");

        Arrays.sort(strings, Comparator.reverseOrder());

        StringBuilder sb = new StringBuilder();
        for (String str : strings) {
            sb.append(str);
        }

        return sb.toString();
    }
}