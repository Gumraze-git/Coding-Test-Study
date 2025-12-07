import java.util.*;

class Solution {
    public List<List<Integer>> solution(int[][] arr) {
        // 2차원 정수 배열 arr
        // arr의 행의 수가 더 많으면 -> 열의 수가 행의 수와 같아지도록 각 행의 끝에 0을 추가
        // 열의 수가 더 많다면 행의 수가 열의 수와 같아지도록 열의 끝의 0을 추가
        int row = arr.length;
        int col = arr[0].length;
        
        // 기존 데이터 복사
        List<List<Integer>> answer = new ArrayList<>();

        for (int i = 0; i < arr.length; i++) {
            List<Integer> rowList = new ArrayList<>();
            for (int j = 0; j < arr[i].length; j++) {
                rowList.add(arr[i][j]);  // 값을 그대로 복사
            }
            answer.add(rowList);
        }
        
        while (col != row) {
            if (row > col) {
                for (List<Integer> l : answer) {
                    l.add(0);
                }
                col++;
            } else {
                // 새 행 만들기
                List<Integer> newRows = new ArrayList<>();
                
                // 현재 열의 개수만큼 0 채우기
                for (int i = 0; i < col; i++) {
                    newRows.add(0);
                }
                
                answer.add(newRows);
                
                row++;
            }
        }
        return answer;
    }
}
