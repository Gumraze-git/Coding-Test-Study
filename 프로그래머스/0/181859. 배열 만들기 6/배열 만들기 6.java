import java.util.*;

class Solution {
    public List<Integer> solution(int[] arr) {
        // 0과 1로만 이루어진 정수 배열 arr -> 비트 연산?
        // 새로운 배열을 만드려고 함
        // i의 초기값을 0으로 설정하고 i가 arr의 길이보다 작으면 다음을 반복함.
        
        // stk가 빈 배열이면 arr[i]를 stk에 추가하고 i에 1을 더함.
        // stk에 원소가 있고, stk의 마지막 원소가 arr[i]과 같으면 -> stk의 마지막 원소를 stk에서 제거하고 i에 1을 더함. -> 스택?
        // stk에 원소 있음, 마지막 원소가 arr[i]과 다르면 stk의 마지막에 arr[i]를 추가하고 i에 1을 더함.
        // 빈 배열이면 -1 return
        List<Integer> stk = new ArrayList<>();
        int i = 0;

        while (i < arr.length) {
            if (stk.isEmpty()) {    
                stk.add(arr[i]);
                i++;
            } else {
                if (stk.get(stk.size() - 1) == arr[i]) {
                    stk.remove(stk.size() - 1);
                    i++;
                } else {
                    stk.add(arr[i]);
                    i++;
                }
            }
        }

        if (stk.isEmpty()) {
            return Arrays.asList(-1);
        }

        return stk;
    }
}
