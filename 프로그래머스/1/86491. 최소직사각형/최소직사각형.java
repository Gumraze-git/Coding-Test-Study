class Solution {
    public int solution(int[][] sizes) {
        // 지갑의 크기를 결정하려고 함.
        // 모든 조건을 만족하는 크기를 결정해야함.
        
        int maxWidth = 0;
        int maxHeight = 0;
        
        for (int[] size : sizes) {
            int width = size[1] >= size[0] ? size[1] : size[0];
            int height = size[1] < size[0] ? size[1] : size[0];
            
            
            maxWidth = (maxWidth < width) ? maxWidth = width : maxWidth;
            maxHeight = (maxHeight < height) ? maxHeight = height : maxHeight;
        }
        
        return maxWidth * maxHeight;
    }
}