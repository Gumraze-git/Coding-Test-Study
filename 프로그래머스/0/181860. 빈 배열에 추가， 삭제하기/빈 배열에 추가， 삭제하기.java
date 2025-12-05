import java.util.*;
class Solution {
    public Deque<Integer> solution(int[] arr, boolean[] flag) {
        // 빈 배열 X
        // 길이가 같은 정수 배열 arr과 boolean 배열 flag가 주어짐.
        // flag가 true이면 x뒤에 arr[i]를 arr[i] * 2번 추가
        // flag가 false이면, x에서 마지막 arr[i]개의 원소를 제거
        Deque<Integer> answer = new ArrayDeque<>();
        int index = 0;
        
        for (boolean b : flag) {
            if (b) {
                for (int i = 0; i < arr[index] * 2; i++) {
                    answer.addLast(arr[index]);
                }
            } else {
                for (int j = 0; j < arr[index]; j++) {
                    answer.removeLast();
                }
            }
            index++;
        }
        return answer;
    }
}