import java.util.*;

class Solution {
    public List<Integer> solution(int[] num_list, int n) {
        // num_list의 첫 번재 원소부터 마지막 원소까지 n개 간격으로 저장되어 있는 리스트 return
        List<Integer> answer = new ArrayList<>();
        
        for (int i = 0; i < num_list.length; i += n) {
            answer.add(num_list[i]);
        }
        return answer;
    }
}