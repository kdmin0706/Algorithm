class Solution {
    public int solution(int hp) {        
        int answer = 0;
        //장군개미 : 5
        if (hp / 5 > -1) {
            answer += hp / 5;
            hp %= 5;
        }       
        
        //병정개미 : 3
       if (hp / 3 > -1) {
            answer += hp / 3;
            hp %= 3;
        }       
        //일개미 : 1
        if (hp / 1 > -1) {
            answer += hp / 1;
            hp %= 1;
        }   
        //사냥감에 체력에 맞는 최소한의 병력
        
        return answer;
    }
}