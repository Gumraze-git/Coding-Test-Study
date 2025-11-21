import java.util.*;

class Solution {
    public List<Integer> solution(int[] num_list, int n) {
        // n번째 원소부터 마지막 원소까지의 모든 리스트
        List<Integer> answer = new ArrayList<>();   
        for (int i = n - 1; i < num_list.length; i++) {
            answer.add(num_list[i]);
        }
        return answer;
    }
}