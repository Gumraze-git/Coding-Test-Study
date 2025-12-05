class Solution {
    public int solution(String myString, String pat) {
        // myString에서 pat이 등장하는 횟수를 return
        int answer = 0;
        int len = pat.length();
        for (int i = 0; i <= myString.length() - len; i++) {
            if (myString.substring(i, i+len).equals(pat)) {
                answer++;
            }
        }
        return answer;
    }
}