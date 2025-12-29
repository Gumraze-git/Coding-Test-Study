class Solution {
    public boolean solution(int x) {
        // 히샤드 수
        // x의 자릿수의 합으로 x가 나누어져야함.
        // 히샤드 수인지 아닌지를 return
        int sum = 0;
        int temp = x;
        
        while (temp > 0) {
            sum += temp % 10;
            temp /= 10;
        }
        
        return x % sum == 0 ? true : false;
    }
}