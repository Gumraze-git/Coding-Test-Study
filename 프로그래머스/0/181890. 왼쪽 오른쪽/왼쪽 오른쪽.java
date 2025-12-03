// str_list에는 udlr이 여러개 저장되어 있음
// l과 r중 먼저 나오는 문자열이 l이면
// -> 해당 문자열을 기준으로 왼쪽에 있는 문자열을 순서대로 담음
// r이 먼저면 -> r을 기준으로 오른쪽에 있는 문자열을 순서대로 담음   
import java.util.*;

class Solution {
    public List<String> solution(String[] str_list) {
        List<String> answer = new ArrayList<>();

        if (str_list.length == 1) {
            return answer;
        }

        int index = -1;
        boolean isLeft = false; // l이면 true

        // l 또는 r 의 첫 등장 찾기
        for (int i = 0; i < str_list.length; i++) {
            String s = str_list[i];
            if (s.equals("l") || s.equals("r")) {
                index = i;
                isLeft = s.equals("l");
                break;
            }
        }

        // l/r 자체가 없는 경우 → 빈 리스트(혹은 문제 조건에 맞게 처리)
        if (index == -1) return answer;

        if (isLeft) {
            // l이 먼저 → index 이전 요소만 담기
            for (int i = 0; i < index; i++) {
                answer.add(str_list[i]);
            }
        } else {
            // r이 먼저 → index 이후 요소만 담기
            for (int i = index + 1; i < str_list.length; i++) {
                answer.add(str_list[i]);
            }
        }

        return answer;
    }
}
