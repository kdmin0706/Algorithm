class Solution {
    
    public static int iceAmericano = 5500;
    
    public int[] solution(int money) {
        int[] answer = new int[2];
                
        answer[0] = money / iceAmericano;
        answer[1] = money % iceAmericano;
        
        return answer;
    }
}