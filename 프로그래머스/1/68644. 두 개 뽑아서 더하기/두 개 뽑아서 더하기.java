import java.util.*;

class Solution {
    public int[] solution(int[] numbers) {
        // 정수 배열 numbers가 주어짐
        // numbers에서 서로 다른 인덱스에 있는 2개의 수를 뽑아 더해서 만들 수 있는 모든 수을 오름차순으로 정렬하라
        
        List<Integer> result = new ArrayList<>();
        for (int i = 0; i < numbers.length; i++) {
            for (int j = i + 1; j < numbers.length; j++) {
                int sum = numbers[i] + numbers[j];
                
                if (!result.contains(sum)) {
                    result.add(sum);
                }
            }
        }
        
        Collections.sort(result);
        
        int[] answer = new int[result.size()];        
        for (int i = 0; i < result.size(); i++) {
            answer[i] = result.get(i);    
        }
        return answer;
    }
    
    
}