import java.util.*;

class Solution {
    public int solution(String[] strArr) {
        // strArr의 원소들을 길이가 같은 문자열들끼리 그룹으로 묶었을 때
        // 가장 개수가 많은 그룹의 크기를 return
        // 문자열의 길이를 담은 map 생성
        Map<Integer, Integer> map = new HashMap<>();
        for (String s : strArr) {
            int len = s.length();
            map.put(len, map.getOrDefault(len, 0) + 1);
        }

        int max = 0;
        for (int v : map.values()) max = Math.max(max, v);
        return max;
    }
}