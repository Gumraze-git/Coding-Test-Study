import java.util.*;
import java.math.*;

class Solution {
    public int solution(int[] arr) {
        // 0이 하나라도 있으면 LCM은 0
        for (int v : arr) if (v == 0) return 0;

        // 절댓값 기준 최대값
        int maxAbs = 0;
        for (int v : arr) {
            int x = Math.abs(v);
            if (x > maxAbs) maxAbs = x;
        }
        // 모두 1(또는 배열 내 1만 존재)인 경우
        if (maxAbs <= 1) return maxAbs;

        // 최소소인수(SPF) 테이블 구성: O(M log log M), M = maxAbs
        int[] spf = new int[maxAbs + 1];
        for (int i = 2; i * i <= maxAbs; i++) {
            if (spf[i] == 0) { // i는 소수
                for (int j = i * i; j <= maxAbs; j += i) {
                    if (spf[j] == 0) spf[j] = i;
                }
            }
        }
        for (int i = 2; i <= maxAbs; i++) {
            if (spf[i] == 0) spf[i] = i; // 소수 자신
        }

        // 소수별 최대 지수 집계
        Map<Integer, Integer> maxExp = new HashMap<>();
        for (int v : arr) {
            int x = Math.abs(v);
            if (x <= 1) continue;
            while (x > 1) {
                int p = spf[x];
                int cnt = 0;
                while (x % p == 0) {
                    x /= p;
                    cnt++;
                }
                int prev = maxExp.getOrDefault(p, 0);
                if (cnt > prev) maxExp.put(p, cnt);
            }
        }

        // LCM = ∏ p^{maxExp(p)}  (BigInteger로 안전하게 계산)
        BigInteger lcm = BigInteger.ONE;
        for (Map.Entry<Integer, Integer> e : maxExp.entrySet()) {
            lcm = lcm.multiply(BigInteger.valueOf(e.getKey()).pow(e.getValue()));
        }

        // int로 변환 (범위 초과 시 ArithmeticException)
        return lcm.intValueExact();
    }
}