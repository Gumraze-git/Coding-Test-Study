class Solution {
    
    // 모음 사전
    private static final char[] VOWELS = {'A', 'E', 'I', 'O', 'U'};
    
    private int count = 0; // 사전에 등록된 단어 개수
    private int answer = 0; // 찾은 위치
    private boolean found = false;
    
    public int solution(String word) {
        dfs(word, "");      // 빈 문자열에서 시작해야 "A"가 첫 번째가 됨
        return answer;
    }
    
    private void dfs(String target, String cur) {
        // 종료 조건
        // 이미 찾았으면 더 탐색하지 않음
        if (found) return;
        if (cur.length() > 5) return;       // 6이상 이면 pass
        
        // 빈 문자열은 사전에 포함되지 않음으로 제외하고 count 증가
        if (!cur.isEmpty()) {
            count++;
            if (cur.equals(target)) {
                answer = count;
                found = true;
                return;
            }
        }
        
        // 다음 상태 생성: 뒤에 모음 하나 붙이기
        if (cur.length() == 5) return; // 길이 5이상이면 더 확장 불가
        
        for (char c : VOWELS) {
            dfs(target, cur + c);
        }  
    }
}