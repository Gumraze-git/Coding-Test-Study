import java.util.*;

class Solution {
    public int solution(int[] array) {
        Arrays.sort(array);         // 정렬 수행
        int mid = array.length / 2; // 중앙값 확인
        return array[mid];
    }
}