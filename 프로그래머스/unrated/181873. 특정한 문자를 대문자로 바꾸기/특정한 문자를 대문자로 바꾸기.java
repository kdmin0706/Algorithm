class Solution {
    public String solution(String my_string, String alp) {
        String[] s = my_string.split("");
        StringBuilder sb = new StringBuilder(); 

        for (int i = 0; i < s.length; i++) {
            if(s[i].equalsIgnoreCase(alp))
            {
                sb.append(s[i].toUpperCase());
            }
            else{
                sb.append(s[i]);
            }
        }
        return sb.toString();        
    }
}