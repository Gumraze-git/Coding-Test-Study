import java.util.*;

class Solution {
    public int solution(String[][] clothes) {
        // 각 종류별로 최대 1가지 의상만 착용 가능함.
        // 의상이 일부 겹칠 수 있으나 추가로 착용한 경우는 다른 경우로 처리함.
        // 하루에 최소 한 개 의상을 입음.
        
        Map<String, Integer> map = new HashMap<>();
        
        // 종류별 개수 집계
        for (String[] item : clothes) {
            map.put(item[1], map.getOrDefault(item[1], 0) + 1);
        }
        System.out.println(map);
        
        // (count + 1)들을 곱한 뒤, -1
        int answer = 1;
        for (int count : map.values()) {
            answer *= (count + 1);      // 아무것도 선택하지 않는 경우 고려
        }
        
        // 아무것도 안입는 경우 제외
        answer -= 1;
        
        return answer;
    }
}