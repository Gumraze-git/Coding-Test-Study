import java.util.*;

class Solution {
    public int solution(int[] elements) {
        int n = elements.length;
        
        // 배열 2배 확장 -> 원형 수열 처리
        int[] extended = new int[n * 2];
        for (int i = 0; i < n; i++) {
            extended[i] = elements[i];
            extended[i + n] = elements[i];
        }
        
        // 중복 제거용 Set
        Set<Integer> sums = new HashSet<>();
        
        // 부분 수열 길이
        for (int length = 1; length <= n; length++) {
            // 시작 위치는 0 ~ n-1
            for (int start = 0; start < n; start++) {
                int sum = 0;
                for (int k = 0; k < length; k++) {
                    sum += extended[start + k];
                }
                sums.add(sum);
            }
        }
        
        return sums.size();
    }
}