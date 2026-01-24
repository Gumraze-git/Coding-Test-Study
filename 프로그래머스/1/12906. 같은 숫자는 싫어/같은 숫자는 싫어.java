import java.util.*;

public class Solution {
    public int[] solution(int[] arr) {
        // arr의 각 원소는 0~9임.
        // arr에서 연속적으로 나타나는 숫자는 하나만 남기고 전부 제거하려고 함.
        
        Stack<Integer> stack = new Stack<>();
        
        for (int num = 0; num < arr.length; num++) {
            if (stack.isEmpty()) {
                stack.push(arr[num]);
            } else {
                // 마지막에 넣은 값이랑 비교
                if (arr[num] == stack.peek()) {
                    continue;
                } else {
                    stack.push(arr[num]);
                }
            }
        }
        
        // int[]로 변환
        int[] answer = stack.stream()
            .mapToInt(Integer::intValue)
            .toArray();      
        return answer;
    }
}