class Solution {
    public double solution(int[] arr) {
        // 정수를 담고 있는 배열 arr의 평균값을 구하라
        int sum = 0;
        
        for (int i : arr) {
            sum += i;
        }
        
        double answer = (double) sum / arr.length; 
        return answer;
    }
}