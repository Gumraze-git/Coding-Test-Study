import java.util.*;

class Solution {
    public String solution(int[] numbers) {
        String[] arr = new String[numbers.length];
        
        for (int i = 0; i < numbers.length; i++) {
            arr[i] = String.valueOf(numbers[i]);
        }
        
        // 커스텀 정렬 수행
        Arrays.sort(arr, (a, b) -> (b + a).compareTo(a + b));
        
        // 모두 0인 경우의 예외 처리
        if (arr[0].equals("0")) {
            return "0";
        }
        
        // 이어 붙이기
        StringBuilder sb = new StringBuilder();
        for (String s : arr) {
            sb.append(s);
        }
        
        return sb.toString();
    }
}