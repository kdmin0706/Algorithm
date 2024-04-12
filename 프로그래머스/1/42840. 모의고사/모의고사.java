import java.util.*;
import java.util.stream.*;

class Solution {
    private static final int[][] RULES = {
        {1,2,3,4,5},
        {2,1,2,3,2,4,2,5},
        {3,3,1,1,2,2,4,4,5,5}
    };
    
    private int getPicked(int person, int problem) {
        int[] rule = RULES[person];
        int index = problem % rule.length;
        return rule[index];
    }
    
    public int[] solution(int[] answers) {
        int[] correct = new int[3];
        int max = 0;
        
        for (int i = 0; i < answers.length; i++) {
            int answer = answers[i];
            for (int j = 0; j < 3; j++) {
                int pick = getPicked(j, i);                
                if(answer==pick) {
                    if(++correct[j] > max) {
                        max = correct[j];
                    }
                }
            }
        }
        
        final int maxCorrect = max;
        return IntStream.range(0, 3)
            .filter(i -> correct[i] == maxCorrect)
            .map(i -> i + 1)
            .toArray();
    }
}