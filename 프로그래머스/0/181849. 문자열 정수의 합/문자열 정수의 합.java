class Solution {
    public int solution(String num_str) {
        int answer = 0;
        String[] strings = num_str.split("");
        for (String s : strings) {
            answer += Integer.parseInt(s);
        }
        
        return answer;
    }
}