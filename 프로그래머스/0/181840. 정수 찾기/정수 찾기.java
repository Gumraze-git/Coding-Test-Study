class Solution {
    public int solution(int[] num_list, int n) {
        // num_list안에 n이 있으면? 1 : 0
        for (int i : num_list) {
            if (i == n) {
                return 1;
            }
        }
        return 0;
    }
}