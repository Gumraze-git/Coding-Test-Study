class Solution {
    public int solution(int[] num_list) {
        // 정수가 있을 때, 짝수이면 반으로 나눔
        // 홀수이면 1을 뺀 뒤 반으로 나누면, 마지막에는 1이 됨.
        // num_list가 주어질 때 list의 모든 원소를 1로 만들기 위해서 필요한 나누기의 횟수
        int answer = 0;
        
        for (int i : num_list) {
            while(i > 1) {
                if (i % 2 == 0) {
                    i /= 2;
                } else {
                    i = (i - 1) / 2;
                }
                answer++;
            }
        }
        return answer;
    }
}