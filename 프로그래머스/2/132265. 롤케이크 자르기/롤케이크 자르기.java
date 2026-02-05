import java.util.*;

class Solution {
    public int solution(int[] topping) {
        Map<Integer, Integer> rightCount = new HashMap<>();
        Set<Integer> leftKinds = new HashSet<>();
        
        // 오른쪽 빈도 구성
        for (int t : topping) {
            rightCount.put(t, rightCount.getOrDefault(t, 0) + 1);
        }
        System.out.println(rightCount);    
        
        int rightDistinct = rightCount.size();
        int leftDistinct = 0;
        int count = 0;
        
        for (int i = 0; i < topping.length - 1; i++) {
            int t = topping[i];
            
            // 왼쪽 종류 갱신
            if (leftKinds.add(t)) {
                leftDistinct++;
            }
            // 오른쪽 빈도 갱신
            int newCount = rightCount.get(t) - 1;
            if (newCount == 0) {
                rightCount.remove(t);
                rightDistinct--;
            } else {
                rightCount.put(t, newCount);
            }
            
            // 비교
            if (leftDistinct == rightDistinct) {
                count++;
            }
        }
        return count;
    }
}