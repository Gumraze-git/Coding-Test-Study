import java.util.*;

class Solution {
    public int[] solution(int[] arr, int[][] queries) {
        // 정수 배열 arr과 2차원 배열 queries가 주어짐.
        // queries의 원소는 각각 하나의 query를 나타냄.
        // queries는 [s, e] 이렇게 구성됨.
        // 각 query마다 순서대로 s <= i <= e인 모든 i에 대해 arr[i]에 1을 더함.
        for (int i = 0; i < queries.length; i++) {
            int s = queries[i][0];
            int e = queries[i][1];

            for (int j = s; j <= e; j++) {
                arr[j]++;
            }
        }
        return arr;
    }
}