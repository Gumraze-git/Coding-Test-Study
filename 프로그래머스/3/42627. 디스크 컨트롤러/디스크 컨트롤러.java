import java.util.*;

class Solution {

    static class Job {
        int requestedAt;
        int time;

        Job(int requestedAt, int time) {
            this.requestedAt = requestedAt;
            this.time = time;
        }
    }

    public int solution(int[][] jobs) {
        int n = jobs.length;

        Job[] arr = new Job[n];
        for (int i = 0; i < n; i++) {
            arr[i] = new Job(jobs[i][0], jobs[i][1]);
        }

        // 1) 요청 시각 기준 정렬
        Arrays.sort(arr, (a, b) -> {
            if (a.requestedAt != b.requestedAt) return a.requestedAt - b.requestedAt;
            return a.time - b.time; // 필수는 아니지만 안정성 위해
        });

        // 2) pq: 소요시간이 짧은 작업 우선
        PriorityQueue<Job> pq = new PriorityQueue<>((a, b) -> {
            if (a.time != b.time) return a.time - b.time;
            return a.requestedAt - b.requestedAt; // tie-break (필수 아님)
        });

        int now = 0;
        int idx = 0;
        long totalTurnaround = 0;

        // 3) 시뮬레이션
        while (idx < n || !pq.isEmpty()) {

            // now까지 도착한 작업을 pq에 넣음
            while (idx < n && arr[idx].requestedAt <= now) {
                pq.add(arr[idx]);
                idx++;
            }

            if (pq.isEmpty()) {
                // 대기 중인 작업이 없으면 다음 요청 시각으로 점프
                now = arr[idx].requestedAt;
                continue;
            }

            Job cur = pq.poll();
            now += cur.time;
            totalTurnaround += (now - cur.requestedAt);
        }

        return (int)(totalTurnaround / n);
    }
}
