import java.util.*;

public class Solution {
    public int solution(int n) {
        int answer = 0;
        String strInt = String.valueOf(n);
        for (char c : strInt.toCharArray()) {
            answer += Integer.parseInt("" + c);
        }

        return answer;
    }
}