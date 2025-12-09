class Solution {
    public int solution(int n) {
        // 피자를 7조각으로 잘라줌
        // 피자를 나눠먹을 사람의 수 n이 주어짐
        // 모든 사람이 피자를 한 조각 이상 먹기위해 필요한 피자의 수
        return n % 7 > 0 ? n / 7 + 1 : n / 7;
    }
}