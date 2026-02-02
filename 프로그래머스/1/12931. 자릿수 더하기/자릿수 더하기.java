// 재귀로 풀이
public class Solution {
    public int solution(int n) {
        return digitSum(n);
    }
    
    // 상태 정의
    // digitSum(n) = (n % 10) + digitSum(n / 10)
    private int digitSum(int n) {
        if (n < 10) {
            return n;
        }
        return (n % 10) + digitSum(n / 10);
    }
    
}