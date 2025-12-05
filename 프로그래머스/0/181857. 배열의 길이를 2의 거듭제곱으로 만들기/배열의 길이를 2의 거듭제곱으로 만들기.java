class Solution {
    public int[] solution(int[] arr) {
        // arr이 매개변수로 주어짐
        // arr의 길이가 2의 정수 거듭제곱이 되도록 0을 추가
        // 길이는 arr보다 크면서 2의 제곱 수중 가장 작아야함.
        int len = 1;
        while (len < arr.length) {
            len *= 2;   // len 을 2의 제곱수로 증가시킴
        }
        
        int[] answer = new int[len];
        System.arraycopy(arr, 0, answer, 0, arr.length);
        return answer;
    }
}
