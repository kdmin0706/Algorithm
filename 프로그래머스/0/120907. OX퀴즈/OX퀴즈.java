class Solution {
    public String[] solution(String[] quiz) {
        String[] answer = new String[quiz.length];

        for (int i = 0; i < answer.length; i++) {
            String[] result = quiz[i].split(" ");

            int first = Integer.parseInt(result[0]);
            int second = Integer.parseInt(result[2]);
            int checkValue = 0;

            char c = result[1].charAt(0);
            if (c == '+') {
                checkValue = first + second;
            } else if (c == '-') {
                checkValue = first - second;
            }

            if (Integer.parseInt(result[result.length - 1]) == checkValue) {
                answer[i] = "O";
            } else {
                answer[i] = "X";
            }
        }

        return answer;
    }
}