class Solution {
    public int solution(String binomial) {
        String[] strings = binomial.split(" ");
        int a = Integer.parseInt(strings[0]);
        int b = Integer.parseInt(strings[2]);
        
        if (strings[1].equals("+")) {
            return a + b;            
        } else if (strings[1].equals("-")) {
            return a - b;
        } else {
            return a * b;
        }
        
    }
}