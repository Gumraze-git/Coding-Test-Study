import java.util.*;

class Solution {
    public int solution(String before, String after) {
        // before와 after가 매개변수로 주어짐.
        // before를 after로 만들수 있으면 1 없으면 0 return
        
        // before와 after를 map으로 각 원소의 개수를 count
        // 동일하면, 순서를 바꾸면 만들 수 있음.
        
        Map<Character, Integer> countBeforeMap = new HashMap<>();
        Map<Character, Integer> countAfterMap = new HashMap<>();
        
        for (char c : before.toCharArray()) {
            countBeforeMap.put(c, countBeforeMap.getOrDefault(c, 0) + 1);
        }
        
        for (char c : after.toCharArray()) {
            countAfterMap.put(c, countAfterMap.getOrDefault(c, 0) + 1);
        }
        
        int answer = 0;
        return countBeforeMap.equals(countAfterMap) ? 1 : 0;
    }
}