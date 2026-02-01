import java.util.*;

class Solution {
    public int[] solution(int[] answers) {
        int[] first = {1, 2, 3, 4, 5};
        int[] second = {2, 1, 2, 3, 2, 4, 2, 5};
        int[] third = {3, 3, 1, 1, 2, 2, 4, 4, 5, 5};

        int scoreFirst = 0;
        int scoreSecond = 0;
        int scoreThird = 0;

        for (int i = 0; i < answers.length; i++) {
            int answer = answers[i];

            if (first[i % first.length] == answer) scoreFirst++;
            if (second[i % second.length] == answer) scoreSecond++;
            if (third[i % third.length] == answer) scoreThird++;
        }

        int maxScore = Math.max(scoreFirst, Math.max(scoreSecond, scoreThird));

        List<Integer> result = new ArrayList<>();
        if (scoreFirst == maxScore) result.add(1);
        if (scoreSecond == maxScore) result.add(2);
        if (scoreThird == maxScore) result.add(3);

        return result.stream().mapToInt(Integer::intValue).toArray();
    }
}
