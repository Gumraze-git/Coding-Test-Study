import java.util.*;

class Solution {
    public List<String> solution(String[] todo_list, boolean[] finished) {
        // 할일이 담긴 문자열 배열 todo_list와 각각의 일을 마쳤는지 나타내는 finished가 주어짐.
        // todo_list에서 false인 것들을 문자열에 담음
        List<String> answer = new ArrayList<>();
        for (int i = 0; i < todo_list.length; i++) {
            if (!finished[i]) answer.add(todo_list[i]);
        }
        return answer;
    }
}