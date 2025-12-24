import java.util.*;

class Solution {
    public int[] solution(int[] numlist, int n) {
        // 정수 n을 기준으로 n과 가까운 수부터 정렬
        // 더 큰수를 앞으로
        
        // Comparator 사용을 위해 Integer 사용
        Integer[] arr = new Integer[numlist.length];
        
        // arr에 numlist 복사
        for (int i = 0; i < numlist.length; i++) {
            arr[i] = numlist[i];
        }
        
        // 정렬 수행
        Arrays.sort(arr, (a, b) -> {
            int diffA = Math.abs(a - n);
            int diffB = Math.abs(b - n);
            
            // 1차 기준: n과의 거리
            if (diffA != diffB) {
                return diffA - diffB;
            }
            
            // 2차 기준: 큰 수 먼저
            return b - a;

        });
        
        // 다시 int[]로 변환
        int[] answer = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            answer[i] = arr[i];
        }
        
        return answer;
    }
}