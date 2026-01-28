import java.util.*;

class Solution {
    public int[] solution(int[] array, int[][] commands) {
        // 배열 array의 i번째 숫자부터 j번째 숫자까지 자르고 정렬했을 때 k번째 있는 수를 구하려함
        
        List<Integer> result = new ArrayList<>();
        for (int[] com : commands) {
            int[] tempArray = Arrays.copyOfRange(array, com[0]-1, com[1]);
            Arrays.sort(tempArray);
            result.add(tempArray[com[2] - 1]);
        }
        int[] answer = result.stream()
            .mapToInt(Integer::intValue)
            .toArray();
        return answer;
    }
}