import java.util.Arrays;
import java.util.stream.IntStream;

public class Solution {
    public int solution(int[] citations) {
        int n = citations.length;
        return IntStream.rangeClosed(0, n)
                        .filter(h -> Arrays.stream(citations)
                                           .filter(c -> c >= h)
                                           .count() >= h)
                        .max()
                        .orElse(0);
    }
}