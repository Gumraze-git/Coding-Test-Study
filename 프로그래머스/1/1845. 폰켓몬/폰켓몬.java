import java.util.*;

class Solution {
    public int solution(int[] nums) {
        // 총 N마리 중 N/2마리를 가져가도 됨.
        // 가능한 많은 종류를 가져가려고 함.
        // HashSet 사용 문제
        int answer = 0;
        Set<Integer> set = new HashSet<>();
        
        for (int num : nums) {
            set.add(num);
            if (set.size() == nums.length / 2) break;
        }
        
        return set.size();
    }
}