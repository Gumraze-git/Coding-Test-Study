// 재귀 한 번 더 연습
import java.util.*;

public class Solution {
    public int solution(int n) {
        // 자연수에 대한 각 자릿수의 합을 구해서 return하여라
        // 각 자릿수의 합 -> n % 10으로 첫 번째 자릿 수 계산
        // 현재 상태는 n / 10으로 업데이트
        int answer = digitSum(n);

        return answer;
    }
    // 상태 정의
    // digitSum(n): 자연수 n의 각 자릿수의 합을 반환함.
    private int digitSum(int n) {
        // 종료 조건
        if (n == 0) {
            return 0;
        }
        
        // 다음 상태
        int sum = n % 10;
        int next = n / 10;
        
        return sum + digitSum(next);
    }
}