class Solution {
    public int solution(int n) {
        // 3의 배수와 3을 사용하지 않음
        // 1, 2, 3, 4, 5, 6,  7,  8,  9, 10, 11, 12, 13, 14, 15
        // 1, 2, 4, 5, 7, 8, 10, 11, 14, 16, 17, 19, 20, 22, 25
        
        int target = 1;
        int answer = 1;
        
        while (target < n) {
            answer++;
            String temp = String.valueOf(answer);
            
            // 3으로 나누어지거나 3을 포함하고 있으면 answer를 1씩 더함
            if (answer % 3 != 0 && !temp.contains("3")) {
                target++;
            }
        }
        return answer;
    }
}