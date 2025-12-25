class Solution {
    public int solution(int i, int j, int k) {
        // 정수 i, j, k가 주어짐
        // i부터 j까지 k가 몇 번 등장하는지 return
        int answer = 0;
        
        for (int n = i; n <= j; n++) {
            String temp = String.valueOf(n);
            String[] splited = temp.split("");
            for (String s : splited) {
                if (Integer.parseInt(s) == k) {
                    answer++;
                }
            }   
        }
        return answer;
    }
}