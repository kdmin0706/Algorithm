import java.util.*;
class Solution {
    public String solution(String s) {
        String[] strings = s.split(" ");

        int[] array = Arrays.stream(strings).mapToInt(Integer::parseInt).toArray();

        int min = Arrays.stream(array).min().getAsInt();
        int max = Arrays.stream(array).max().getAsInt();

        return min + " " + max;
    }
}