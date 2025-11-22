class Solution {
    public String solution(String[] str_list, String ex) {
        // 문자열 리스트에 ex가 들어 있는 것들을 제외하고 꼬리 문자열을 만드시오
        
        String answer = "";
        for (String s : str_list) {
            answer += (s.contains(ex))
                ? ""
                : s;
        }
        return answer;
    }
}