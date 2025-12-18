import java.util.*;

class Solution {
    public int[] solution(int[] array) {
        // 가장 큰 수와 그 수의 인덱스를 담은 배열을 return
        int max = array[0];
        int idx = 0;
        
        for (int i = 1; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];
                idx = i;
            }
        }
        
        return new int[] { max, idx };
    }
}