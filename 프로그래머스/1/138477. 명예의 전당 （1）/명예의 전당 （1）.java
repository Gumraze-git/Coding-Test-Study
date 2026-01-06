import java.util.*;

class Solution {
    public int[] solution(int k, int[] score) {
        // 점수가 지금까지 출연 가수들의 점수 중 상위 k번째 이내이면 해당 가수의 점수를 명예의 전당에 올림
        // 초기 k일까지는 모든 출연 가수의 점수가 명예의 전당에 오름
        // k일 다음 부터는 명예의 전당의 점수가 업데이트됨
        // 이 프로그램은 명예의 전당의 최하점을 return함.
        int[] answer = new int[score.length];
        
        // 명예의 전당 리스트
        List<Integer> list = new ArrayList<>();
        
        for (int i = 0; i < score.length; i++) {
            list.add(score[i]);
            list.sort(Collections.reverseOrder()); // 내림차순
            
            if (list.size() < k) {
                answer[i] = list.get(list.size() - 1);
            } else {
                answer[i] = list.get(k - 1);
            }
        }
            
        return answer;
    }
}