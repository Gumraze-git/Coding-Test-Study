class Solution {
    public double solution(int[] numbers) {
        // 정수 배열 numbers의 평균값을 return하라.
        double answer = 0;
        for (int i : numbers) {
            answer += i;
        }
        return answer / numbers.length;
    }
}