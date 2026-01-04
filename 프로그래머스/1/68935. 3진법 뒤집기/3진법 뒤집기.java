class Solution {
    public int solution(int n) {
        // 자연수 n이 매개변수로 주어짐
        // n을 3진법 상에서 앞뒤로 뒤집음
        // 이를 다시 10진법으로 표현한 수를 return
        
        // 3진법으로 변환
        String ternary = Integer.toString(n, 3);
        // 앞 뒤 반전
        StringBuilder sb = new StringBuilder(ternary).reverse();
        // 10진법으로 변환
        int answer = Integer.parseInt(sb.toString(), 3);        
        return answer;
    }
}