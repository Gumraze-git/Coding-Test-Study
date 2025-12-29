class Solution {
    public int solution(int num) {
        long n = num;
        int count = 0;
        
        
        while (n != 1) {
            // 500번 시도해도 안되면 중단 
            if (count == 500) {
                return -1;
            }
            
            // 입력된 수가 짝수이면 2로 나눔
            if (n % 2 == 0) {
                n /= 2;
            } else {
                // 홀수이면 3을 곱하고 1을 더함
                n = n * 3 + 1;
            }
            count++;
        }
        return count;
    }
}