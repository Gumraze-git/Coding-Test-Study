class Solution {
    public int solution(int n) {
        // 정수 n을 입력받아 n의 약수를 모두 더한 값을 리턴하라.
        int answer = 0;
        for (int i = 1; i * i <= n; i++) {
            if (n % i == 0) {
                answer += i;
                if (i != n / i) {
                    answer += n / i;
                }
            }
        }
        
        return answer;
    }
}