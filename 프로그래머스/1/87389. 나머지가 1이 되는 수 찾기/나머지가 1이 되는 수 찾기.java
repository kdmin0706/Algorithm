class Solution {
    public int solution(int n) {
        int mod = 0;
        for(int i=1;i<n;i++) {
            if(n % i == 1) {
                mod = i;
                break;
            }
        }
        
        return mod;
    }
}