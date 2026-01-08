class Solution {
    public String[] solution(int n, int[] arr1, int[] arr2) {
        String[] answer = new String[n];
        
        for (int i = 0; i < n; i++) {
            // 두 지도를 OR 연산으로 합침
            int merged = arr1[i] | arr2[i];
            
            // 이진수 문자열로 변환
            String binary = Integer.toBinaryString(merged);
            
            // 길이가 n보다 짧으면 앞에 0채우기
            if (binary.length() < n) {
                binary = "0".repeat(n - binary.length()) + binary;
            }
            
            // 1->#, 0->' '
            StringBuilder line = new StringBuilder();
            for (char c : binary.toCharArray()) {
                if (c == '1') {
                    line.append('#');
                } else {
                    line.append(' ');
                }
            }
            
            answer[i] = line.toString();
        }
        return answer;
    }
}