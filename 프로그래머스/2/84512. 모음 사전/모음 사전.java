class Solution {
    private String[] list = {"A", "E", "I", "O", "U"};
    // 몇 번째 단어인지 기록
    private int count = 0;
    
    public int solution(String word) {
        dfs(word, "", 0);
        
        return count;
    }
    
    // dfs: 모든 문자열을 사전 순으로 만들기
    private boolean dfs(String word, String current, int depth) {
        // 종료 조건: 길이 제한, 단어가 일치하면 종료
        if (current.length() > 5) return false;
        
        // 빈 문자열을 단어로 세지 않음
        if (!current.isEmpty()) {
            // 사전 순서 업데이트
            count++;
            if (current.equals(word)) return true;
        }
        
        // 모든 사전의 단어에 대해서
        // A -> AA -> AAA -> AAAA -> ...
        for (String s : list) {
            if (dfs(word, current + s, depth + 1)) return true;
        }
        return false;
    }
}