// 20260204 그리디 연습
import java.util.*;

class Solution {
    public int solution(int n, int[] lost, int[] reserve) {

        // 1) Set 구성 (존재 여부 조회/삭제를 빠르게)
        Set<Integer> reserveSet = new HashSet<>();
        Set<Integer> lostSet = new HashSet<>();

        for (int r : reserve) reserveSet.add(r);
        for (int l : lost) lostSet.add(l);

        // 2) 겹치는 학생 제거: 본인이 입고 끝(빌려줄 수도, 빌릴 필요도 없음)
        //    lostSet을 순회하면서 제거하므로 Iterator 사용
        Iterator<Integer> it = lostSet.iterator();
        while (it.hasNext()) {
            int student = it.next();
            if (reserveSet.contains(student)) {
                reserveSet.remove(student);
                it.remove();
            }
        }

        // 3) 그리디: 번호 작은 lost부터, 앞번호 -> 뒷번호
        List<Integer> lostList = new ArrayList<>(lostSet);
        Collections.sort(lostList);

        int answer = n - lostList.size(); // 아직 못 입는 사람 수만큼 제외

        for (int student : lostList) {
            if (reserveSet.contains(student - 1)) {
                reserveSet.remove(student - 1);
                answer++;
            } else if (reserveSet.contains(student + 1)) {
                reserveSet.remove(student + 1);
                answer++;
            }
        }

        return answer;
    }
}
