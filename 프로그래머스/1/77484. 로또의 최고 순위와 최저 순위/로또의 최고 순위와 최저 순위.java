class Solution {
    public int[] solution(int[] lottos, int[] win_nums) {
        int matchCount = 0;
        int zeroCount = 0;
        
        for (int lotto : lottos) {
            if (lotto == 0) {
                zeroCount++;
                continue;
            }
            for (int win_num : win_nums) {
                if (lotto == win_num) {
                    matchCount++;
                    break;
                }
            }
        }
        
        int maxRank = calculateRank(matchCount + zeroCount);
        int minRank = calculateRank(matchCount);
        
        
        return new int[] {maxRank, minRank};
    }
    
    
    private int calculateRank(int matchCount) {
        switch (matchCount) {
            case 6: return 1;
            case 5: return 2;
            case 4: return 3;
            case 3: return 4;
            case 2: return 5;
            default: return 6;
        }
    }    
}