import java.util.*;

class Solution {
    public int[] solution(int[] answers) {

        int[] fir = {1, 2, 3, 4, 5};
        int[] sec = {2, 1, 2, 3, 2, 4, 2, 5};
        int[] thr = {3, 3, 1, 1, 2, 2, 4, 4, 5, 5};

        int[] scores = new int[3];

        for (int i = 0; i < answers.length; i++) {
            if (answers[i] == fir[i % fir.length]) scores[0]++;
            if (answers[i] == sec[i % sec.length]) scores[1]++;
            if (answers[i] == thr[i % thr.length]) scores[2]++;
        }

        int max = Math.max(scores[0], Math.max(scores[1], scores[2]));

        List<Integer> result = new ArrayList<>();
        for (int i = 0; i < 3; i++) {
            if (scores[i] == max) {
                result.add(i + 1);
            }
        }

        return result.stream().mapToInt(i -> i).toArray();
    }
}
