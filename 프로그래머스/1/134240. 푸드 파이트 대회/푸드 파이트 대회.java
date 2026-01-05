class Solution {
    public String solution(int[] food) {
        // 한 선수는 제일 왼쪽에 있는 음식부터 오른쪽으로, 다른 선수는 제일 오른쪽에 있는 음식부터 왼쪽으로
        // 중앙에 있는 물을 먼저 마시는 사람이 이김.
        // 칼로리가 낮은 음식을 먼저 먹을 수 있게 배치
        // 대회를 위한 음식의 배치를 하여라
        // food[0]은 물의 양으로 항상 1임
        // food[i]는 i번 음식의 수
        // index가 음식의 칼로리임.
        StringBuilder answer = new StringBuilder();
        
        for (int i = 1; i < food.length; i++) {
            for (int j = 0; j < food[i]/2; j++) {
                answer.append(i);
            } 
        }
        
        return answer.toString() + "0" + answer.reverse().toString();
    }
}