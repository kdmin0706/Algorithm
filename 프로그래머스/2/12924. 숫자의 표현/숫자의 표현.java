class Solution {
    public int solution(int n) {
        int count = 0;

        int sum = 0;
        for (int i = 1; i <= n; i++) {
            sum += i;
            for (int j = i + 1; j <= n; j++) {
                if (sum > n || sum == n) {
                    break;
                }

                sum += j;
            }

            if (sum == n) {
                count++;
            }

            sum = 0;
        }

        return count;
    }
}