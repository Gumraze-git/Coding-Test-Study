class Solution {
    public String solution(String[] cards1, String[] cards2, String[] goal) {
        int p1 = 0; // cards1 포인터
        int p2 = 0; // cards2 포인터

        for (int i = 0; i < goal.length; i++) {
            // cards1에서 현재 카드가 goal과 일치하는 경우
            if (p1 < cards1.length && goal[i].equals(cards1[p1])) {
                p1++;
            }
            // cards2에서 현재 카드가 goal과 일치하는 경우
            else if (p2 < cards2.length && goal[i].equals(cards2[p2])) {
                p2++;
            }
            // 둘 다 아니면 만들 수 없음
            else {
                return "No";
            }
        }

        return "Yes";
    }
}
