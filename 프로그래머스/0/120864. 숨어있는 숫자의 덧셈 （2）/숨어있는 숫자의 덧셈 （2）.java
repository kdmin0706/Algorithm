class Solution {
    public int solution(String my_string) {
        int answer = 0;

        String[] nums = my_string.split("[^0-9]");
        for (String s : nums) {
            if (!s.isEmpty()) {
                answer += Integer.parseInt(s);
            }
        }
        
        return answer;
    }
}