class Solution {
    public static int fact(int n) {
        if (n <= 1) {
            return n;
        } else {
            return n * fact(n - 1);
        }
    }
    
    public int solution(int n) {
        int answer = 0;
        for (int i = 1; i <= 10; i++) {
            if (n >= fact(i)) {
                answer = i;
            } else {
                break;
            }
        }        
        return answer;
    }
}