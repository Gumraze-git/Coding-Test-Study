class Solution {
    public int solution(int[] numbers) {
        // String으로 변환 후 contain으로 찾기
        String temp = "";
        int answer = 0;
        
        for (int i : numbers) {
            temp += i;
        }
        
        for (int i = 0; i < 10; i ++) {
            if (!temp.contains(String.valueOf(i))) {
                answer += i;
            }
        }
        return answer;
    }
}