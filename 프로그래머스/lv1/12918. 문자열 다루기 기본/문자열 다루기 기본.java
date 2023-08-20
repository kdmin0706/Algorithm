class Solution {
    public boolean solution(String s) {
        boolean answer = true;
        if(s.length() != 4 && s.length() != 6)    return false;
        
        s = s.toLowerCase();
        for(int i = 0; i< s.length(); i++){
            if(s.charAt(i) >= 'a' && s.charAt(i) <= 'z'){
                answer = false;
                break;
            }
        }
        
        return answer;
    }
}