class Solution {
    public long solution(int price, int money, int count) {
        long totalCost = 0L;
        for(int i = 1; i <= count; i++) {
            totalCost += (long) price * i;
        }
        
        long answer = totalCost - money;
        return answer > 0 ? answer : 0;
    }
}
