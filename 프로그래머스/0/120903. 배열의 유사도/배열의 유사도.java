class Solution {
    public int solution(String[] s1, String[] s2) {
        // 두 배열이 얼마나 유사한지 확인
        int answer = 0;
        
        // 단순 비교
        for (int i = 0; i < s1.length; i++) {
            for (int j = 0; j < s2.length; j++) {
                if (s1[i].equals(s2[j])) {
                    answer++;
                }
            }
        }
        return answer;
    }
}