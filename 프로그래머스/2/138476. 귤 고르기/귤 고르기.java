import java.util.*;

class Solution {
    public int solution(int k, int[] tangerine) {
        int answer = 0;
        
        // 중복제거
        Set<Integer> set = new HashSet<>();
        for (int num : tangerine) {
            set.add(num);
        }
        
        // 각 요소가 몇개가 있는지 count
        Map<Integer, Integer> freqMap = new HashMap<>();
        
        for (int num: set) {
            System.out.println(num);
        }
        
        
        
        
        System.out.println(set.toString());
        
        return answer;
    }
}