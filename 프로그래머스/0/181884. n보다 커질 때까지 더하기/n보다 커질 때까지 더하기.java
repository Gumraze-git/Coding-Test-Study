class Solution {
    public int solution(int[] numbers, int n) {
        // 정수 배열 numbers와 정수 n이 주어짐.
        // number의 원소를 앞에서부터 하나씩 더하다가 n보다 커지는 순간 stop
        int answer = 0;
        for (int i = 0; i < numbers.length; i++) {
            answer += numbers[i];
            if (answer > n) break;
        }
        return answer;
    }
}