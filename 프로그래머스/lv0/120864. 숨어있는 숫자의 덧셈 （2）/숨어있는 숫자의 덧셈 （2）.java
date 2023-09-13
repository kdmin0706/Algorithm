import java.util.*;

class Solution {
    public int solution(String my_string) {

        String[] ms = my_string.split("[a-zA-Z]");
        System.out.println("ms:" + Arrays.toString(ms));
        String[] nums = my_string.split("[^0-9]");
        System.out.println("nums:" + Arrays.toString(nums));

        int answer = 0;
        for(int i = 0; i < nums.length; i++) {
            if(!nums[i].isEmpty()) {
                answer += Integer.parseInt(nums[i]);
            }
        }
        
        return answer;
    }
}