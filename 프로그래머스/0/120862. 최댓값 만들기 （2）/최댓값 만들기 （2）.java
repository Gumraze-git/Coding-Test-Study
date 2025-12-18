import java.util.*;

class Solution {
    public int solution(int[] numbers) {
        // 두 수를 곱해서 최댓값 만들기
        // 정렬 후
        Arrays.sort(numbers);
        
        // 양 끝의 조합만 비교
        int max = numbers[0] * numbers[1] > numbers[numbers.length - 2] * numbers[numbers.length - 1]
                    ? numbers[0] * numbers[1]
                    : numbers[numbers.length - 2] * numbers[numbers.length - 1];
        return max;
    }
}