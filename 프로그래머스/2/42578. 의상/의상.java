import java.util.*;

class Solution {
    public int solution(String[][] clothes) {
        // 각 종류별로 최대 1가지 의상만 착용 가능함.
        // 의상이 일부 겹칠 수 있으나 추가로 착용한 경우는 다른 경우로 처리함.
        // 하루에 최소 한 개 의상을 입음.
        
        Map<String, Integer> map = new HashMap<>();
        
        for (String[] c : clothes) {
            String type = c[1];
            System.out.println(type);
            
            map.put(type, map.getOrDefault(type, 0) + 1);
        }
        
        int answer = 1;
        for (int cnt : map.values()) {
            System.out.println("cnt: " + cnt);
            answer *= (cnt + 1);
            
            System.out.println("answer: " + answer);
        }
        
        System.out.println(map);
        
        
        return answer - 1;
    }
}