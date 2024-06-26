class Solution {
    public int solution(int n, int m, int[] section) {
        int start = section[0];
        int answer = 1;

        for (int i  = 1; i < section.length; i++) {
            if (start + m - 1 < section[i]) {
                answer++;
                start = section[i];
            }
        }
        
        return answer;
    }
}