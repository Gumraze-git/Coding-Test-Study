import java.util.*;

class Solution {
    public List<Integer> solution(String my_string) {
        // my_string 안에 있는 숫자만 골라 오름차순으로 정렬
        List<Integer> answer = new ArrayList<>();
        
        for (char c : my_string.toCharArray()) {
            if (Character.isDigit(c)) {
                answer.add(c - '0');
            }
        }
        Collections.sort(answer);
        return answer;
    }
}