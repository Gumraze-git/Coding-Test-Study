import java.util.*;

class Solution {
    public List<Integer> solution(int[] num_list, int n) {
        // 정수 num_list와 정수 n이 주어질 때,
        // num_list를 n번째 원소 이후의 원소들과
        // n번째 까지의 원소들로 나누어
        // n번째 원소 이후의 원소들을 n번째 까지의 원소들 앞에 붙인 리스트를 return
        List<Integer> answer = new ArrayList<>();
        for (int j = n; j < num_list.length; j++) {
            answer.add(num_list[j]);
        }
        
        for (int i = 0; i < n; i++) {
            answer.add(num_list[i]);
        }
    
        return answer;
    }
}