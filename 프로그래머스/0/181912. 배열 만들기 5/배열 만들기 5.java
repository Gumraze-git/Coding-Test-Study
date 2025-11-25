import java.util.*;
class Solution {
    public List<Integer> solution(String[] intStrs, int k, int s, int l) {
        // intStrs와 정수 k, s, l이 주어짐
        // intStrs의 원소는 숫자로 이루어져 있음.
        // 각 원소마다 s 번 인덱스에서 시작하는 길이 l 짜리 부분 문자열을 잘라내 정수로 변환함.
        // 이 때 변환한 정수값이 k보다 큰 값들을 담은 배열을 return
        List<Integer> answer = new ArrayList<>();
        for (String str : intStrs) {
            int subInt = Integer.parseInt(str.substring(s, s + l));
            if (subInt > k) {
                answer.add(subInt);
            }
        }
        return answer;
    }
}