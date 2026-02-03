// 20260203 dfs 연습
import java.util.*;

class Solution {
    // 경로 처리
    private List<String> path = new ArrayList<>();
    
    public String[] solution(String[][] tickets) {
        // tickets의 각 행에는 [from, to] 형태임
        // 주어진 항공권은 모두 사용해야함.
        // 가능한 경로가 2개 이상일 경우에는 알파벳 순서가 앞서는 경로를 return함.
        // 백트래킹을 위해서 방문처리도 필요함.
        
        // 정렬을 미리 수행해서 처리
        Arrays.sort(tickets, (a, b) -> {
            if (!a[0].equals(b[0])) return a[0].compareTo(b[0]);
            return a[1].compareTo(b[1]);
        });
        boolean[] visited = new boolean[tickets.length];
        
        path.add("ICN");
        dfs("ICN", 0, visited, path, tickets);
            
        return path.toArray(new String[0]);
    }
    
    // 모든 경로를 탐색해야함.
    // backtracking이 필요함
    // 가능 경로가 있다면 정렬해서 선택해야함. 
    // -> 티켓을 알파벳 순으로 선택하도록 만들어 놓으면.
    //    첫 번째 선택하는 경로가 정답이됨.
    // current: 현재 공항
    // usedCount: 지금까지 사용한 티켓의 수
    // visited[i]: i번 티켓을 사용했는지
    // path: 지금까지의 경로들
    private boolean dfs(String current, int usedCount, boolean[] visited, List<String> path, String[][] tickets) {       
        // 종료 조건: 모든 티켓을 사용하면 종료
        if (usedCount == tickets.length) return true;
        
        // 모든 티켓에 대해서
        for (int i = 0; i < tickets.length; i++) {
            // 방문하지 않았고 AND 티켓이 일치하면
            if (!visited[i] && tickets[i][0].equals(current)) {
                // 방문 처리
                visited[i] = true;
                
                // 경로 업데이트
                path.add(tickets[i][1]);
                
                // 다음 단계 수행
                if (dfs(tickets[i][1], usedCount + 1, visited, path, tickets)) return true;
                
                // 해당 경로가 적용이 안된다면
                path.remove(path.size() - 1);
                visited[i] = false;
            }
        }
        return false;
    }
}