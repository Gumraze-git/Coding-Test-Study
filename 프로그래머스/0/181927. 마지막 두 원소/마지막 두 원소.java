import java.util.*;

class Solution {
    public List<Integer> solution(int[] num_list) {
        // 마지막 원소가 그전 원소보다
        // 크면, 마지막 원소에서 그 전 원소를 뺀 값 return
        // 작으면, 마지막 원소를 두 배 한 값 return
        List<Integer> answer = new ArrayList<>();
        
        // 기존 요소 복사
        for (int n : num_list) {
            answer.add(n);            
        }
        int last = num_list[num_list.length - 1];
        int secLast = num_list[num_list.length - 2];
        
        if (last > secLast) {
            
            answer.add(last - secLast);
        } else {
            answer.add(last * 2);
        }
        return answer;
    }
}