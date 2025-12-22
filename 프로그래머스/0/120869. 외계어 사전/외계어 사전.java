import java.util.*;

class Solution {
    public int solution(String[] spell, String[] dic) {
        // 알파벳이 담긴 배열 spell
        // 외계어 사전 dic
        // spell에 담긴 알파벳을 한 번씩만 모두 사용한 단어가 dic에 존재하면 1
        // 존재하지 않으면 2
        char[] target = String.join("", spell).toCharArray();
        Arrays.sort(target);
        
        for (String word : dic) {
            if (word.length() != target.length) continue;
            
            char [] w = word.toCharArray();
            Arrays.sort(w);
            
            if (Arrays.equals(target, w)) {
                return 1;
            }
        }
        return 2;
    }
}