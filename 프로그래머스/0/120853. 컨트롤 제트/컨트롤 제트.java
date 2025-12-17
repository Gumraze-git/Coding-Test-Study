class Solution {
    public int solution(String s) {
        // 숫자와 Z가 공백으로 구분되어 담긴 문자열
        // 문자열에 있는 숫자를 차례대로 더함.
        // 이때 Z가 나오면 바로 전에 더했던 숫자를 뺀다는 의미임.
        int answer = 0;
        String[] data = s.split(" ");
        int memory = 0;
        for (int i = 0; i < data.length; i++) {
            if (data[i].equals("Z")) {
                answer -= memory;
            } else {
                int num = Integer.parseInt(data[i]);
                answer += num;
                memory = num;
            }
        }
        return answer;
    }
}