import java.util.*;

public class Solution {
    public int[] solution(int[] arr) {
        // arr의 원소는 0부터 9까지로 이루어져 있음.
        // 배열 arr에서 연속적으로 나타나는 숫자는 하나만 남기고 전부 제거함.
        // 단, 순서를 유지하면서
        
        List<Integer> answer = new ArrayList<>();
        
        for (int i = 0; i < arr.length; i++) {
            // 첫 원소 넣기
            if (answer.size() == 0) {
                answer.add(arr[i]);
            } else {
                if (answer.get(answer.size() - 1) == arr[i]) {
                    continue;
                } else {
                    answer.add(arr[i]);
                }
            }
        }
        
        // 다시 변환    
        int[] result = answer.stream()
                            .mapToInt(Integer::intValue)
                            .toArray();
        return result;
    }
}