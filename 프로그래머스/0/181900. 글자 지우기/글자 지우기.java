import java.util.*;

class Solution {
    public String solution(String my_string, int[] indices) {
        // 문자열 my_string과 정수 배열 indices가 주어질 때,
        // my_string에서 indices의 원소에 해당하는 인덱스의 글자를 지우고 return
        String answer = "";
        int p = 0;
        Arrays.sort(indices);
        for (int i = 0; i < my_string.length(); i++) {
            if (p < indices.length && i == indices[p]) {
                p++;
                continue;
            }
            answer += my_string.charAt(i);
        }
        return answer;
    }
}