class Solution {
    public String solution(String s) {
        StringBuilder answer = new StringBuilder();
        boolean capitalizeNext = true;

        for (char c : s.toCharArray()) {
            if (c == ' ') {
                answer.append(c);
                capitalizeNext = true;
            } else {
                if (capitalizeNext) {
                    answer.append(Character.toUpperCase(c));
                } else {
                    answer.append(Character.toLowerCase(c));
                }
                capitalizeNext = false;
            }
        }

        return answer.toString();
    }
}