class Solution {
    public String solution(String my_string) {
        StringBuffer sb = new StringBuffer();        
        for (char c : my_string.toCharArray()) {
            if (c != 'a' && c != 'e' && c != 'i' && c != 'o' && c != 'u') {
                sb.append(c);
            }
        }
        
        return sb.toString();
    }
}