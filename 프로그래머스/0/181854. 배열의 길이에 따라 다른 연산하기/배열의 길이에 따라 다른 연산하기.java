class Solution {
    public int[] solution(int[] arr, int n) {
        // arr의 길이가 홀수면 -> arr의 모든 짝수 인덱스에 n을 더함
        // arr의 길이가 짝수면 -> arr의 모든 홀수 인덱스에 n을 더함
        
        // 다른 풀이
        int start = (arr.length % 2 != 0) 
            ? 0
            : 1;
        
        for (int i = start; i < arr.length; i += 2) {
            arr[i] += n;
        }
        
        
        // 기본 풀이
//         if (arr.length % 2 != 0) {
//             for (int i = 0; i < arr.length; i += 2) {
//                 arr[i] += n;
//             }
//         } else {
//             for (int i = 1; i < arr.length; i += 2) {
//                 arr[i] += n;
//             }
//         }
        
        
        return arr;
    }
}