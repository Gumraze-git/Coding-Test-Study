class Solution {
    public int[] solution(int[] numbers, String direction) {
        // 배열의 원소를 direction 방향으로 한 칸씩 회전시킨 배열을 return
        int[] answer = new int[numbers.length];
        
        if (direction.equals("right")) {
            for (int i = 0; i < numbers.length; i++) {
                answer[(i + 1) % numbers.length] = numbers[i];
            }
        } else {
            for (int i = 0; i < numbers.length; i++) {
                answer[(i - 1 + numbers.length) % numbers.length] = numbers[i];
            }
        }
        
        return answer;
    }
}