class Solution {
    public int solution(int order) {
        String orderString = String.valueOf(order);
        int answer = 0;
        for (char c : orderString.toCharArray()) {
            System.out.println(c);
            if (c == '3' || c == '6' || c == '9') {
                answer += 1;
            }
        }
        return answer;
    }
}