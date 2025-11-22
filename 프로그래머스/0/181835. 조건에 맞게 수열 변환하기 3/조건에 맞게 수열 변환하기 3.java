class Solution {
    public int[] solution(int[] arr, int k) {
        // 자연수가 홀수이면, arr의 모든 원소에 k를 곱함.
        // 자연수가 짝수이면, arr의 모든 원소에 k를 더함.
        int[] answer = new int[arr.length];
        
        for (int i = 0; i < arr.length; i++) {
            answer[i] = (k % 2 != 0)
                ? arr[i] * k
                : arr[i] + k;
        }
        
        // for (int i = 0; i < arr.length; i++) {
        //     if (k % 2 != 0) {
        //         answer[i] =  arr[i] * k;
        //     } else {
        //         answer[i] =  arr[i] + k;
        //     }
        // }
        
        
        // if (k % 2 != 0) {
        //     for (int i = 0; i < arr.length; i++) {
        //         answer[i] =  arr[i] * k;
        //     }
        // } else {
        //     for (int i = 0; i < arr.length; i++) {
        //         answer[i] =  arr[i] + k;
        //     }
        // }
        
        return answer;
    }
}