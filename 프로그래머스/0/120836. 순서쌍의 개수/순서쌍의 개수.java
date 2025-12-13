class Solution {
    public int solution(int n) {
        int answer = 0;
        // 순서쌍의 값의 곱이 n인 자연수 순서쌍 개수를 count
        for (int i = 1; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                if (i * i == n) {
                    answer += 1; // (i, i) 1개
                } else {
                    // (i, n/i), (n/i, i) 2o
                    answer += 2;
                }
            }
        }
        return answer;
    }
}