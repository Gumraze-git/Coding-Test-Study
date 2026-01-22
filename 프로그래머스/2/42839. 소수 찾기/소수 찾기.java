import java.util.*;

class Solution {
    
    private boolean[] visited;
    private Set<Integer> primes = new HashSet<>(); // 중복 제거
    
    public int solution(String numbers) {
        
        List<Integer> list = new ArrayList<>();
        for (char c : numbers.toCharArray()) {
            list.add(c - '0');
        }
        
        visited = new boolean[list.size()];
        
        dfs(list, "");
    
        return primes.size();
    }
    
    private void dfs(List<Integer> list, String current) {
        // 현재 노드 처리
        if (!current.isEmpty()) {
            int num = Integer.parseInt(current);
            if (isPrime(num)) {
                primes.add(num);
            }
        }
        
        // 다음 상태 생성
        for (int i = 0; i < list.size(); i++) {
            if (!visited[i]) {
                visited[i] = true;
                dfs(list, current + list.get(i));
                visited[i] = false;
            }
        }   
    }
    
    private boolean isPrime(int n) {
        if (n < 2) return false; //0, 1제외
        
        for (int i = 2; i * i <= n; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
}