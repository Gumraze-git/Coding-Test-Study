import java.util.ArrayList;
import java.util.List;

class Solution {

    // 이동 기록을 누적한다. 각 원소는 [from, to] 형태.
    private final List<int[]> moves = new ArrayList<>();

    public int[][] solution(int n) {
        // n개의 원판을 1번 기둥에서 3번 기둥으로 옮긴다. 2번 기둥은 보조로 사용한다.
        move(n, 1, 3, 2);

        // List<int[]> -> int[][] 로 변환
        int[][] answer = new int[moves.size()][2];
        for (int i = 0; i < moves.size(); i++) {
            answer[i][0] = moves.get(i)[0];
            answer[i][1] = moves.get(i)[1];
        }
        return answer;
    }

    /**
     * move(k, from, to, via)
     * 의미:
     * - k개의 원판을 from 기둥에서 to 기둥으로 옮기는 모든 이동을 moves에 기록한다.
     * - via 기둥은 임시 보조 기둥으로 사용한다.
     */
    private void move(int k, int from, int to, int via) {
        // 종료 조건: 옮겨야 할 원판이 1개라면, 한 번만 이동하면 된다.
        if (k == 1) {
            moves.add(new int[]{from, to});
            return;
        }

        // 1) 위의 k-1개를 from -> via 로 옮긴다 (to를 보조로 사용).
        move(k - 1, from, via, to);

        // 2) 가장 큰 원판(남아있는 1개)을 from -> to 로 옮긴다.
        moves.add(new int[]{from, to});

        // 3) via에 옮겨둔 k-1개를 via -> to 로 옮긴다 (from을 보조로 사용).
        move(k - 1, via, to, from);
    }
}
