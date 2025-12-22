import java.util.*;

class Solution {
    public int solution(int[] sides) {
        // 삼각형의 완성조건
        // 가장 긴 변의 길이는 다른 두 변의 길이의 합보다 작아야함.

        // 긴 변, 작은 변의 길이
        int max = Math.max(sides[0], sides[1]);
        int min = Math.min(sides[0], sides[1]);
        
        // max가 긴 변일 경우
        // max - min < rest <= max
        int maxResult = min;
        
        // rest가 긴 변일 경우
        // max < rest < max + min
        int restResult = min - 1;
        
        return maxResult + restResult;
    }
}