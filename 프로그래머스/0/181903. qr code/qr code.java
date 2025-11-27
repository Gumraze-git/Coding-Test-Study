class Solution {
    public String solution(int q, int r, String code) {
        // code의 각 인덱스를 q로 나누었을 때 나머지가 r인 위치의 문자를 앞에서부터 이어붙여서 return 해라
        // qn + r으로 추출
        String answer = "";
        
        for (int i = r; i < code.length(); i += q) {
            answer += code.charAt(i);
        }
        
        return answer;
    }
}