class Solution {
    public int solution(int M, int N) {
        // 필요한 가위질 횟수는 최종 조각 수 - 초기 조각 수
        return M * N - 1;
    }
}