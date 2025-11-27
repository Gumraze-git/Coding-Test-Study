class Solution {
    public int solution(int[] num_list) {
        // 정수 리스트 가장 첫 번째 원소를 1번 원소라고 할때,
        // 홀수 번째 원소들의 합과 짝수 번째 원소들의 합 중 큰 값을 return
        int odd = 0; // 홀수 번째 원소 리스트의 합
        int even = 0; // 짝수 번째 원소 리스트의 합
        
        for (int i = 0; i < num_list.length; i++) {
            if (i % 2 == 0) {
                odd += num_list[i];
            } else {
                even += num_list[i];
            }   
        }
        return (odd > even) ? odd : even;
    }
}