import java.util.*;

class Solution {
    public List<Integer> solution(int[] num_list, int n) {
        // 리스트 슬라이싱 하는 법
        List<Integer> answer = new ArrayList<>();
        
        for (int i = 0; i < n; i++) {
            answer.add(num_list[i]);
        }
        
        return answer;
    }
}