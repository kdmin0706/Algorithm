class Solution {
    public int solution(int num1, int num2) {
        double d = (double)num1/(double)num2;
        d*= 1000;
        System.out.println(d);
        int answer = (int)d;
        return answer;
    }
}