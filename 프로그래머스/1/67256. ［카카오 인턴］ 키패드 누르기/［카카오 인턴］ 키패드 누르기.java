import java.util.*;

class Solution {
    public String solution(int[] numbers, String hand) {
        StringBuilder sb = new StringBuilder();
        
        // 시작 위치, * = 10, 0 = 11, # = 12
        int leftPos = 10;
        int rightPos = 12;
        
        // 오른손이면 true, 왼손이면 false
        boolean rightHanded = "right".equals(hand);
        
        for (int n : numbers) {
            // 0 이면 11으로 편의상 처리
            int target = (n == 0) ? 11 : n;
            
            // 왼쪽 열(1, 4, 7)
            if (target % 3 == 1) {
                sb.append("L");
                leftPos = target;
                continue;
            }
            
            // 오른쪽 열 (3, 6, 9)
            if (target % 3 == 0) {
                sb.append("R");
                rightPos = target;
                continue;
            }
            
            // 가운데 열(2, 5, 8, 0) -> 거리 비교
            int leftDist = dist(leftPos, target);
            int rightDist = dist(rightPos, target);
            
            if (leftDist < rightDist) {
                sb.append("L");
                leftPos = target;
            } else if (rightDist < leftDist) {
                sb.append("R");
                rightPos = target;
            } else {
                if (rightHanded) {
                    sb.append("R");
                    rightPos = target;
                } else {
                    sb.append("L");
                    leftPos = target;
                }
            }
        }
        
        return sb.toString();
    }
    
    private int dist(int from, int to) {
        int fromRow = (from - 1) / 3;
        int fromCol = (from - 1) % 3;
        int toRow = (to - 1) / 3;
        int toCol = (to - 1) % 3;
        return Math.abs(fromRow - toRow) + Math.abs(fromCol - toCol);
    }
}