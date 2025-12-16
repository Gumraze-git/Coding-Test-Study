import java.util.*;

class Solution {
    public int solution(int[] numbers) {
        // numbers의 원소 중 2개를 곱해 만들 수 있는 최댓값을 return
        Arrays.sort(numbers);
        return numbers[numbers.length - 1] * numbers[numbers.length - 2];
    }
}