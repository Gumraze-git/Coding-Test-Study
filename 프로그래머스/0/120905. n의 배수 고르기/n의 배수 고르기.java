import java.util.*;

class Solution {
    public List<Integer> solution(int n, int[] numlist) {
        // 정수 배열 numlist가 매개변수로 주어질 때
        // numlist에서 n의 배수가 아닌 수들 제거        
        List<Integer> answer = new ArrayList<>();
        
        for (int i : numlist) {
            if (i % n == 0) {
                answer.add(i);
            }
        }
        
        return answer;
    }
}