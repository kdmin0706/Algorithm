class Solution {
    public int[] solution(String myString) {
        String[] strings = myString.split("x", -1);
        int[] answer = new int[strings.length];
        
        for(int i = 0; i < answer.length; i++) {
            answer[i] = strings[i].length();
        }
        
        return answer;
    }
}