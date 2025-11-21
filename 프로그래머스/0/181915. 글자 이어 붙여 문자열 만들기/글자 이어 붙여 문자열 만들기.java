class Solution {
    public String solution(String my_string, int[] index_list) {
        // my_string의 index_list의 원소들에 해당하는 인덱스의 글자들을 이어붙여라
        String answer = "";
        for (int n : index_list) {
            char compo = my_string.charAt(n);
            answer += compo;
        }
        
        return answer;
    }
}