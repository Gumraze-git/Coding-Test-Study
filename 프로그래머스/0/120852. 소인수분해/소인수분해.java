import java.util.*;

class Solution {
    public List<Integer> solution(int n) {
        // 소인수 분해
        
        List<Integer> answer = new ArrayList<>();
        int i = 2;
        
        while(i * i <= n) {
            if (n % i == 0) {
                // 중복 제거
                if (answer.isEmpty() || answer.get(answer.size() - 1) != i) {
                    answer.add(i);    
                }
                n /= i;
            } else {
                i++;
            }
        }
        
        if (n > 1) {
            if (answer.isEmpty() || answer.get(answer.size() - 1) != n) {
                answer.add(n);
            }
        }
        
        return answer;
    }
}