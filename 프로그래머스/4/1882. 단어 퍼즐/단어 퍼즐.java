import java.util.*;

class Solution {
    public int solution(String[] strs, String t) {
        int n = t.length();
        int[] dp = new int[n + 1];

        // 충분히 큰 값으로 초기화
        Arrays.fill(dp, Integer.MAX_VALUE);
        dp[0] = 0;

        for (int i = 1; i <= n; i++) {
            for (String s : strs) {
                int len = s.length();

                // 현재 위치에서 s로 끝낼 수 있는지 확인
                if (i >= len && dp[i - len] != Integer.MAX_VALUE) {
                    if (t.startsWith(s, i - len)) {
                        dp[i] = Math.min(dp[i], dp[i - len] + 1);
                    }
                }
            }
        }

        return dp[n] == Integer.MAX_VALUE ? -1 : dp[n];
    }
}
