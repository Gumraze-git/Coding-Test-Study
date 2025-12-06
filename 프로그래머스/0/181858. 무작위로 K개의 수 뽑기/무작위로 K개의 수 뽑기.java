import java.util.*;

class Solution {
    public List<Integer> solution(int[] arr, int k) {
        Set<Integer> seen = new HashSet<>();
        List<Integer> result = new ArrayList<>();

        for (int x : arr) {
            if (!seen.contains(x)) {
                seen.add(x);
                result.add(x);
                if (result.size() == k) break;  // k개 채우면 종료
            }
        }

        // 부족한 부분은 -1로 채움
        while (result.size() < k) {
            result.add(-1);
        }

        return result;
    }
}
