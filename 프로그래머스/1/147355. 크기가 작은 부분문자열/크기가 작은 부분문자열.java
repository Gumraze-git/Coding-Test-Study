class Solution {
    public int solution(String t, String p) {
        // 숫자로 이루어진 문자열 t, p
        // t에서 p와 길이가 같은 부분 문자열 중
        // 부분문자열이 나타내는 수가 p보다 작거나 같은 것이 나타나는 횟수를 return
        
        int answer = 0;
        long pNum = Long.parseLong(p);
        
        for (int i = 0; i <= t.length() - p.length(); i++) {
            long sub = Long.parseLong(t.substring(i, i + p.length()));
            if (sub <= pNum) {
                answer++;
            }
        }
        return answer;
    }
}