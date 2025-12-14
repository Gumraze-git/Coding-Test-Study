class Solution {
    public int solution(int balls, int share) {
        // balls개의 구슬 중 share개의 구슬을 고르는 가능한 모든 경우의 수를 return
        long result = 1;
        
        int r = Math.min(share, balls - share);
        
        for (int i = 1; i <= r; i++) {
            result = result * (balls - r + i) / i;
        }
        return (int) result;
    }
}