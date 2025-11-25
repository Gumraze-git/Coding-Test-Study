import java.util.*;

class Solution {
    public int solution(int[] numbers) {
        Arrays.sort(numbers);  // 오름차순 정렬

        // 가장 큰 두 수는 맨 뒤에 있음
        int answer = numbers[numbers.length - 1] * numbers[numbers.length - 2];
        return answer;
    }
}