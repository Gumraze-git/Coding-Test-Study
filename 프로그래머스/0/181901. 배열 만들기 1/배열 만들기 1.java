import java.util.*;

class Solution {
    public List<Integer> solution(int n, int k) {
        // 정수 n과 k가 주어졌을 때, 1이상 n이하의 정수 중에서 k의 배수를 오름차순으로 정렬하여 return
        List<Integer> answer = new ArrayList<>();
        
        for (int i = k; i <= n; i += k) {
            answer.add(i);
        }
        return answer;
    }
}