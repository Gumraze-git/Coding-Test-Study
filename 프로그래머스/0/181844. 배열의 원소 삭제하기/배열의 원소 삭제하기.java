import java.util.*;

class Solution {
    public List<Integer> solution(int[] arr, int[] delete_list) {
        List<Integer> answer = new ArrayList<>();
        // Set으로 풀이
        Set<Integer> delSet = new HashSet<>();
        
        // 삭제할 원소들을 Set에 담기
        for (int d : delete_list) {
            delSet.add(d);
        }
        
        // arr를 돌면서 Set에 없는 값 추가
        for (int x : arr) {
            if (!delSet.contains(x)) {
                answer.add(x);
            }
        }
        
        //
        // 이중 for 문
//         for (int i = 0; i < arr.length; i++) {
//             int target = arr[i];
//             boolean shouldDelete = false;   // 이 숫자를 지워야 하는지 표시

//             for (int j = 0; j < delete_list.length; j++) {
//                 if (delete_list[j] == target) {
//                     shouldDelete = true;    // 삭제 대상이다!
//                     break;                  // 더 볼 필요 없음
//                 }
//             }

//             if (!shouldDelete) {            // 끝까지 봤는데도 삭제 대상이 아니면
//                 answer.add(target);         // 결과에 추가
//             }
//         }
        
        return answer;
    }
}