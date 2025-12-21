class Solution {
    public String[] solution(String my_str, int n) {
        // my_str을 길이 n씩 잘라서 저장한 배열을 return
        // 길이 찾기
        int length = my_str.length() % n != 0
            ? my_str.length() / n + 1
            : my_str.length() / n;
        
        String[] answer = new String[length];
        
        // 순회하면서 배열에 넣기
        for (int i = 0; i < length; i++) {
            if (i == length - 1) {
                answer[i] = my_str.substring(i * n);
            } else {
                answer[i] = my_str.substring(i * n, i * n + n);   
            }
        }
        return answer;
    }
}