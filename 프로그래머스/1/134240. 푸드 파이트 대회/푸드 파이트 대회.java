class Solution {
    public String solution(int[] food) {
        StringBuilder left = new StringBuilder();
        StringBuilder right = new StringBuilder();

        for (int i = 1; i < food.length; i++) {
            int cnt = food[i] / 2;
            for (int j = 0; j < cnt; j++) {
                left.append(i);
                right.insert(0, i);
            }
        }

        left.append(0);

        return left.toString() + right.toString();
    }
}