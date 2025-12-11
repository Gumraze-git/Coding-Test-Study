class Solution {
    public int[] solution(int[] num_list) {
        // 짝수와 홀수의 개수를 담은 배열
        int odd = 0;
        int even = 0;
        
        for (int i : num_list) {
            if (i % 2 == 0) {
                even++;
            } else {
                odd++;
            }
        }
        return new int[]{even, odd};
    }
}