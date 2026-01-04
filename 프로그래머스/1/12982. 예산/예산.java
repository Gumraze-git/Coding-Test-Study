import java.util.*;

class Solution {
    public int solution(int[] d, int budget) {
        // 최대한 많은 부서의 물품을 구매해주어야함.
        // 각 부서가 신청한 금액만큼 모두 지원해야함. 1000 -> 1000, 더 적은 금액은 안됨.
        // 부서별 신청한 금액 -> d
        // 예산 -> budget
        // 최대 몇 개의 부서에 물품을 지원할 수 있는지?
        int answer = 0;
        Arrays.sort(d);
                
        for (int i : d) { 
            if (budget < i) {
                break;         
            } else {
                budget -= i;
                answer++;
            }
        }
        return answer;
    }
    
}