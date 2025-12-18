class Solution {
    public int solution(int n) {
        // 제곱수 구하는 법: Math.sqrt()
        int answer = (int) Math.sqrt(n);
        return answer * answer == n ? 1 : 2;
    }
}