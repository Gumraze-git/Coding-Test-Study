class Solution {
    public int solution(int[] arr) {
        // 정수 배열 arr
        // 값이 50보다 크거나 같은 짝수 -> 2로 나눔
        // 50보다 작은 홀수 -> 2를 곱하고 1을 더함
        // 이를 결과 배열이 바뀌지 않을때까지 반복
        
        int answer = 0;
        while (true) {
            boolean changed = false;
            int[] next = new int[arr.length];
            
            for (int i = 0; i < arr.length; i++) {
                int x = arr[i];
                int nx;
                
                if (x >= 50 && x % 2 == 0) {
                    nx = x / 2;
                } else if (x < 50 && x % 2 == 1) {
                    nx = x * 2 + 1;
                } else {
                    nx = x;
                }
                
                next[i] = nx;
                if (nx != x) {
                    changed = true;
                }
            }
            if (!changed) break;
                
                arr = next;
                answer++;
        }
        
        return answer;
    }
}