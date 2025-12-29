import java.util.*;

class Solution {
    public int[] solution(int[] arr, int divisor) {
        // 나누어 떨어지는 숫자 배열
        // array의 element중 divisor로 나누어 떨어지는 값을 오름차순으로 정렬
        
        List<Integer> result = new ArrayList<>();
        boolean temp = false;
        
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % divisor == 0) {
                temp = true;
                result.add(arr[i]);
                
            }
        }
        
        Collections.sort(result);
        
        
        
        if (temp) {
            int[] answer = new int[result.size()];
            for (int i = 0; i < result.size(); i++) {
                answer[i] = result.get(i);
            }
            return answer;
        } else {
            int[] answer = {-1};
            return answer;
        }
    }
}