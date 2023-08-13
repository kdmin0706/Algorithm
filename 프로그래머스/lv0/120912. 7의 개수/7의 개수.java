class Solution {
    public int solution(int[] array) {
        int answer = 0;
        for (int i = 0; i < array.length; i++) {
            String s = Integer.toString(array[i]);
            String[] s1 = s.split("");

            for (int j = 0; j < s1.length; j++) {
                if(s1[j].equals("7")){
                    answer++;
                }
            }
        }

        return answer;
    }
}