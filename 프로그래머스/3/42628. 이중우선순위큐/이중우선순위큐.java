import java.util.*;

class Solution {
    public int[] solution(String[] operations) {
        // 큐에 값을 넣거나,
        // 최댓값을 삭제하거나,
        // 최소값을 삭제하거나,
        // 모든 연산 수행 후 큐가 비어있으면 [0,0] 그렇지 않으면 [최댓값, 최솟값]을 반환하여라.
        TreeMap<Integer, Integer> map = new TreeMap<>();
        
        for (String op : operations) {
            String[] parts = op.split(" ");
            String cmd = parts[0];
            int num = Integer.parseInt(parts[1]);
            
            if (cmd.equals("I")) {
                map.put(num, map.getOrDefault(num, 0) + 1);
            } else {
                if (map.isEmpty()) continue;
                if (num == 1) {
                    // 최댓값 삭제
                    int key = map.lastKey();
                    int cnt = map.get(key);
                    if (cnt == 1) map.remove(key);
                    else map.put(key, cnt - 1);
                } else {
                    // 최솟값 삭제
                    int key = map.firstKey();
                    int cnt = map.get(key);
                    if (cnt == 1) map.remove(key);
                    else map.put(key, cnt - 1);
                }
            }
        }
        if (map.isEmpty()) return new int[]{0, 0};
        return new int[]{map.lastKey(), map.firstKey()};
        
    }
}