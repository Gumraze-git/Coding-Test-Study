import java.util.*;

class Solution {
    public int[] solution(int[] arr, int[] query) {
        // query를 순회하면서 다음 작업을 반복한다.
        // 짝수 인덱스에서는 arr에서 query[i]번 인덱스를 제외하고 배열의 query[i]번 인덱스 뒷부분을 잘라서 버립니다.
        // 홀수 인덱스에서는 arr에서 query[i]번 인덱스는 제외하고 배열의 query[i]번 인덱스 앞부분을 잘라서 버립니다.
        int idx = 0;
        
        for (int q: query) {
            // 짝수인 경우
            if (idx % 2 == 0) {
                arr = Arrays.copyOfRange(arr, 0, q + 1);
            } else {
                // 홀수 번째
                arr = Arrays.copyOfRange(arr, q, arr.length);
            }
            idx++;
        }
        
        return arr;
    }
}