class Solution {
    public int solution(int[] num_list) {
        int a = 1;
        int b = 0;
        
        for (Integer i : num_list) {
            a *= i;
            b += i;
        }
        return (a < b*b) ? 1 : 0;
    }
}