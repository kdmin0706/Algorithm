class Solution {
    public int[] solution(String s) {
        int[] answer = new int[2];

        while (!s.equals("1")) {
            String string = s.replaceAll("0", "");
            answer[1] += s.length() - string.length();

            s = Integer.toBinaryString(string.length());
            answer[0]++;
        }

        return answer;
    }
}