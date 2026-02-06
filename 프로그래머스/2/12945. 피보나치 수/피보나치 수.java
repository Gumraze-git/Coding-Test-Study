class Solution {
    public int solution(int n) {
        final int MOD = 1234567;

        // n이 0 또는 1인 경우 바로 처리 (배열 인덱스 에러 방지)
        if (n <= 1) return n;

        int[] dp = new int[n + 1];
        dp[0] = 0;
        dp[1] = 1;

        for (int i = 2; i <= n; i++) {
            dp[i] = (dp[i - 1] + dp[i - 2]) % MOD; // 매 단계마다 나머지
        }

        return dp[n];
    }
}
