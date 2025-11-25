class Solution {
    public String solution(String[] my_strings, int[][] parts) {
        // parts[i]는 [s, e] 형태로 my_string[i]의 인덱스 s부터 인덱스 e까지의 부분 문자열을 의미함.
        String answer = "";
        for (int i = 0; i < my_strings.length; i++) {
            String temp = my_strings[i].substring(parts[i][0], parts[i][1] + 1);   
            answer += temp;
        }
        return answer;
    }
}