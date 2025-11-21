class Solution {
    public int solution(int n) {
        // n is odd -> n 이하 홀수들의 sum
        // n is even -> n 이하 짝수들의 제곱의 sum
        
        int answer = 0;
        
        if (n % 2 == 0) {
            // 짝수이면
            for (int i = 2; i <= n; i += 2) {
                answer += i*i;
            }
        } else {
            // 홀수이면
            for (int i = 1; i <= n; i += 2) {
                answer += i;
            }
        }
        return answer;
    }
}