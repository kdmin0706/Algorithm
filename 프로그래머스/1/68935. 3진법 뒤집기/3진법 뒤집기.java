class Solution {
    public int solution(int n) {
        String string = Integer.toString(n, 3);

        String reverse = new StringBuilder(string).reverse().toString();

        return Integer.parseInt(reverse, 3);
    }
}