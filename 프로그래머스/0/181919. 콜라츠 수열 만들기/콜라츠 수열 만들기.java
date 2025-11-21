import java.util.*;
class Solution {
    public List<Integer> solution(int n) {
        // 콜라츠 수열 만들기
        // 모든 자연수 x에 대해 현재 값이 x이면
        // x가 짝수이면 2로 나눔
        // x가 홀수이면 3 * x + 1로 계산
        // 언젠간 반드시 1이 되는지 묻는지를 묻는 문제 -> 콜라츠 수열
        List<Integer> answer = new ArrayList<>();
        int result = n;
        
        // result가 1이 아닌 동안 실행
        while (result != 1) {
            // result를 answer에 담기
            answer.add(result);
            // result가 짝수이면
            if (result % 2 == 0) {
                result = result / 2; // 나누기 2              
            } else {
                // 홀수이면,
                result = result * 3 + 1;
            }
        }
        // 마지막으로 1넣기
        answer.add(1);
        return answer;
    }
}