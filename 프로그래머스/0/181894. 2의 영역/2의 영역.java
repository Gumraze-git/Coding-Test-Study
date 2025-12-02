import java.util.*;

class Solution {
    public List<Integer> solution(int[] arr) {
        List<Integer> answer = new ArrayList<>();

        int first = -1;
        int last = -1;

        // 한 번만 순회해서 first, last를 찾는다
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 2) {
                if (first == -1) {
                    first = i;
                }
                last = i;
            }
        }

        // 2가 없는 경우
        if (first == -1) {
            answer.add(-1);
            return answer;
        }

        // 부분 배열 추출
        for (int i = first; i <= last; i++) {
            answer.add(arr[i]);
        }

        return answer;
    }
}
