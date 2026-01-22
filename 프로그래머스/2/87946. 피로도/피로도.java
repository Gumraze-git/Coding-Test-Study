class Solution {
    private int answer = 0;
    private boolean[] visited;

    public int solution(int k, int[][] dungeons) {
        visited = new boolean[dungeons.length];
        dfs(k, dungeons, 0);
        return answer;
    }

    private void dfs(int fatigue, int[][] dungeons, int count) {
        // 현재까지 방문한 던전 수로 최댓값 갱신
        answer = Math.max(answer, count);

        // 다음으로 갈 던전을 선택
        for (int i = 0; i < dungeons.length; i++) {
            if (visited[i]) continue;

            int require = dungeons[i][0];
            int cost = dungeons[i][1];

            // 입장 가능하면 탐색 진행
            if (fatigue >= require) {
                visited[i] = true;
                dfs(fatigue - cost, dungeons, count + 1);
                visited[i] = false; // 백트래킹
            }
        }
    }
}
