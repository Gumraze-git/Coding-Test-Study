import java.util.*;

class Solution {
    public int solution(int[] sides) {
        // 가장 긴 변의 길이는 다른 두 변의 길이의 합보다 작아야함.
        Arrays.sort(sides);
        return (sides[2] < sides[0] + sides[1]) ? 1 : 2;
    }
}