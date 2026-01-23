import java.util.*;

class Solution {
    public int solution(int[] nums) {
        // 총 N마리의 폰켓몬 중 N/2마리를 가져도 된다.
        // 최대한 다양한 종류의 폰켓몬을 가지려 한다.
        // 종류의 수를 반환하다.
        // HashSet문제
        
        Set<Integer> set = new HashSet<>();
        
        for (int i : nums) {       
            set.add(i);    
        }
        // 전체 종류가 M개여도
        int distinctCount = set.size();
        // M/2개 밖에 못가져감.
        int limit = nums.length / 2;
        
        // 전체 종류가 가져간 종류보다 작은 경우 distinctCount
        // 그렇지 않은 경우 최대 가져갈 수 있는 종류 limit
        return Math.min(distinctCount, limit);
    }
}