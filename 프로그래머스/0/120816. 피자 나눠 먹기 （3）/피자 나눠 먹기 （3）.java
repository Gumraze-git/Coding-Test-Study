class Solution {
    public int solution(int slice, int n) {
        // 피자를 2조각에서 10조각까지 원하는 조각 수로 잘라줌
        // slice와 n이 주어질 때,
        // n명의 사림이 최소 한 조각 이상 피자를 먹으려면 최소 몇 판을 시켜야하는가?
        
        
        return n % slice > 0 ? n / slice + 1 : n / slice;
    }
}