import java.util.*;

class Solution {
    public int solution(int[] citations) {
        // H-Index는 과학자의 생산성과 영향력을 나타내는 지표이다.
        // 논문 n편 중, j번 이상 인용된 논문이 h평 이상이고
        // 나머지 논문이 h번 이하 인용되었다면 h의 최댓값이 이 과학자의 H-Index이다.
        Arrays.sort(citations);
        
        int n = citations.length;
        int answer = 0;
        
        for (int i = 0; i < n; i++) {
            int h = n - i;
            if (citations[i] >= h) {
                answer = h;
                break;
            }
        }
        
        return answer;
    }
}