class Solution {
    public String solution(String my_string, String alp) {
        // my_string에서 alp에 해당하는 모든 글자를 대문자로 바꿈
        
        String answer = "";
        for (char c : my_string.toCharArray()) {
            answer += (c == alp.charAt(0)) 
                        ? Character.toUpperCase(c) 
                        : c;
        }
        return answer;
    }
}