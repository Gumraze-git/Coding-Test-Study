import java.util.*;

class Solution {
    public int[] solution(int[] num_list) {
        // 배열을 정렬하기
        Arrays.sort(num_list);
        
        return Arrays.copyOfRange(num_list, 5, num_list.length);
    }
}