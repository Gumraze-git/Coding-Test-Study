class Solution {
    public int solution(int[] number) {
        // 학생은 정수 번호를 가지고 있음.
        // 3명의 학생의 번호를 더했을 때, 0이 되면 해당 3명은 삼총사라고 함.
        // 삼총사를 만들 수 있는 방법의 수를 return
        int answer = 0;
        
        for (int i = 0; i < number.length; i++) {
            for (int j = i + 1; j < number.length; j++) {
                for (int k = j + 1; k < number.length; k++) {
                    int sum = number[i] + number[j] + number[k];
                    if (sum == 0) {
                        answer++;
                    }
                }
            }
        }
        
        return answer;
    }
}