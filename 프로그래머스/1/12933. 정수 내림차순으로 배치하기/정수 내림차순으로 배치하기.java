import java.util.*;

class Solution {
    public long solution(long n) {
        // 정수 n을 매개변수로 입력 받음
        // n의 각 자릿수를 큰 것부터 작은 순으로 정렬
        
        String answer = "";
        
        int len = String.valueOf(n).length();
        List<Long> list = new ArrayList<>();
        while (n > 0) {
            list.add(n % 10);
            n /= 10;
        }
        
        // 내림차순으로 정렬
        Collections.sort(list, Collections.reverseOrder());
        
        for (int i = 0; i < list.size(); i++) {
            answer += list.get(i);
        }
        
        return Long.parseLong(answer);
    }
}