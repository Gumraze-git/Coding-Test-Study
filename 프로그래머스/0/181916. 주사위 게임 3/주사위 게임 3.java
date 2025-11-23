import java.util.Arrays;

class Solution {
    public int solution(int a, int b, int c, int d) {
        int[] dice = {a, b, c, d};
        Arrays.sort(dice);  // 오름차순 정렬

        int p, q;

        // 1) 네 개 모두 같은 경우: xxxx
        if (dice[0] == dice[3]) {
            // p p p p
            return 1111 * dice[0];
        }

        // 2) 세 개만 같은 경우: xxxy 또는 xyyy
        // xxxy : [p, p, p, q]
        if (dice[0] == dice[2] && dice[2] != dice[3]) {
            p = dice[0];      // 세 번 나온 값
            q = dice[3];      // 한 번 나온 값
            int v = 10 * p + q;
            return v * v;
        }
        // xyyy : [q, p, p, p]
        if (dice[1] == dice[3] && dice[0] != dice[1]) {
            p = dice[1];      // 세 번 나온 값
            q = dice[0];      // 한 번 나온 값
            int v = 10 * p + q;
            return v * v;
        }

        // 3) 두 개씩 같은 값: xxyy → [p, p, q, q]
        if (dice[0] == dice[1] && dice[2] == dice[3]) {
            p = dice[0];
            q = dice[2];
            return (p + q) * Math.abs(p - q);
        }

        // 4) 정확히 한 쌍만 같은 경우: p,p,q,r
        // 정렬된 형태: ppqr, pqqr, pqrr 세 가지

        // ppqr : [p, p, q, r]
        if (dice[0] == dice[1] && dice[1] != dice[2] && dice[2] != dice[3]) {
            // 한 번씩 나온 값: dice[2], dice[3]
            return dice[2] * dice[3];
        }
        // pqqr : [p, q, q, r]
        if (dice[1] == dice[2] && dice[0] != dice[1] && dice[2] != dice[3]) {
            // 한 번씩 나온 값: dice[0], dice[3]
            return dice[0] * dice[3];
        }
        // pqrr : [p, q, r, r]
        if (dice[2] == dice[3] && dice[0] != dice[1] && dice[1] != dice[2]) {
            // 한 번씩 나온 값: dice[0], dice[1]
            return dice[0] * dice[1];
        }

        // 5) 모두 다른 경우: abcd → 가장 작은 값
        return dice[0];
    }
}