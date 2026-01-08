import java.util.*;

class Solution {
    public int[] solution(int n, String[] words) {
        // 1번부터 n번까지 순서대로 한 사람씩 단어를 말함.
        // 마지막 사람이 단어를 말한 다음에는 다시 1번부터 시작
        // 끝말잇기 진행함.
        // 사람 수 n과 순서대로 말한 단어 words가 매개변수로 주어짐
        // 가장 먼저 탈락하는 사람이 자신의 몇 번째 차례에 탈락하는지를 return
        int[] answer = new int[2];
        
        // 이미 사용한 단어 저장
        Set<String> used = new HashSet<>();
        
        // 첫 단어는 정상임
        used.add(words[0]);
        
        for (int i = 1; i < words.length; i++) {
            String prev = words[i - 1];
            String curr = words[i];
            
            // 이미 나온 단어인지 확인
            if (used.contains(curr)) {
                answer[0] = (i % n) + 1;
                answer[1] = (i / n) + 1;
                return answer;
            }
            
            // 끝말잇지 규칙 위반
            if (prev.charAt(prev.length() - 1) != curr.charAt(0)) {
                answer[0] = (i % n) + 1;
                answer[1] = (i / n) + 1;
                return answer;
            }
            
            // 정상 단어이면 등록
            used.add(curr);
        }
        
        return answer;
    }
}