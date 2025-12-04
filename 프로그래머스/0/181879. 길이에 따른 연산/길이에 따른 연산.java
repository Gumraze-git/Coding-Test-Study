class Solution {
    public int solution(int[] num_list) {
        // 정수가 담긴 num_list가 주어질 때,
        // 리스트의 길이가 11이상이면 리스트에 있는 모든 원소의 합
        // 10 이하이면 모든 원소의 곱을 return
        int answer = 0;
        
        if (num_list.length > 10) {
            for (int i : num_list) {
                answer += i;
            }
        } else {
            answer++;
            for (int i : num_list) {
                answer *= i;
            }
        }
        return answer;
    }
}