class Solution {
    public String solution(int age) {
        String answer = "";
        
        String s = Integer.toString(age);
        for(int i = 0; i < s.length(); i++){
            answer += (char) ('a' + s.charAt(i) - '0');
        }
        
        return answer;
    }
}