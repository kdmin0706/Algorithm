class Solution {
    public int solution(int[][] sizes) {
        int maxW = 0;
        int maxH = 0;
        
        for (int[] size : sizes) {
            int w = Math.max(size[0], size[1]); // 가로 길이 중 큰 값
            int h = Math.min(size[0], size[1]); // 세로 길이 중 작은 값
            
            // 최대 가로 길이와 최대 세로 길이를 업데이트
            if (w > maxW) {
                maxW = w;
            }
            if (h > maxH) {
                maxH = h;
            }
        }
        
        return maxW * maxH;
    }
}