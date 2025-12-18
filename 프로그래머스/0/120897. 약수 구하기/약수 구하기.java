import java.util.*;

class Solution {
    public List<Integer> solution(int n) {
        // 약수의 오름차순을 담은 배열을 return
        List<Integer> answer = new ArrayList<>();
        
        // n번 계산
        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {
                answer.add(i);
            }
        }
        return answer;
    }
}