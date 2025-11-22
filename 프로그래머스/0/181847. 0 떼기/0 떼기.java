class Solution {
    public String solution(String n_str) {
        // n_str의 가장 왼쪽에 처음으로 등장하는 0들을 땐 문자열을 return
        
        String answer = "";
        int count = 0;
        
        // 0으로 시작하는지 확인
        if (n_str.charAt(0) == '0') {
            // 순회하면서 0이 어디까지 이어지는지 확인
            for (char s : n_str.toCharArray()) {
                // 0이 아닌 값을 만나면
                if (s != '0') {
                    break;
                }
                count += 1;
                System.out.println(count);
            }
            answer = n_str.substring(count, n_str.length());
        } else {
            answer = n_str;
        }
        return answer;
    }
}