class Solution {
    public int solution(int a, int b) {
        // 숫자를 a, b 따라 다른 점수를 가짐
        int answer = 0;
        // a, b 모두 홀수 인 경우
        if (a % 2 != 0 && b % 2 != 0) {
            answer = a * a + b * b;
        } else if (a % 2 != 0 || b % 2 != 0) {
            answer = 2 * (a + b);
        } else if (a % 2 == 0 && b % 2 == 0) {
            answer = Math.abs(a - b);
        }
        return answer;
    }
}