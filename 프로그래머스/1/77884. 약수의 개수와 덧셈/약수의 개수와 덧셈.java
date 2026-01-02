class Solution {
    public int solution(int left, int right) {
        // 약수의 개수와 덧셈
        // 약수의 개수가 짝수이면 더하고, 홀수이면 뺌.
        
        int answer = 0;

        for (int i = left; i <= right; i++) {
            // 약수의 개수 counting
            int count = 0;
            
            for (int j = 1; j * j <= i; j++) {
                if (i % j == 0) {
                    count += (j * j == i) ? 1 : 2;
                }
            }
            
            // count가 짝수이면 더하고, 홀수이면 뺌
            answer += (count % 2 == 0) ? i : -i;
        }
        return answer;
    }
}