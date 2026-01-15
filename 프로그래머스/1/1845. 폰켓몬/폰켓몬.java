import java.util.*;

class Solution {
    public int solution(int[] nums) {
        // 같은 종류의 폰켓몬은 같은 번호를 가지고 있음
        // 최대한 많은 종류의 폰켓몬을 가지는 방법
        
        Set<Integer> kinds = new HashSet<>();
        
        // 중복 제거
        for (int n : nums) {
            kinds.add(n);
        }
        
        // 선택 가능 마리 수
        int maxPick = nums.length / 2;
        
        // 최대로 가질 수 있는 종류       
        return Math.min(kinds.size(), maxPick);
    }
}