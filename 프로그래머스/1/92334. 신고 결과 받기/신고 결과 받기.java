import java.util.*;

class Solution {
    public int[] solution(String[] id_list, String[] report, int k) {
        // 각 유저는 한 번에 한 명의 유저를 신고할 수 있음.
        // 신고 횟수에 제한은 없음, 서로 다른 유저를 계속해서 신고할 수 있음.
        // 한 유저를 여러 번 신고할 수 있지만, 동일 유저의 경우 신고 횟수는 1회로 처리됨.
        // K번 이상 신고된 유저는 게시판 이용이 정지됨
        // 정지되면 해당 유저를 신고한 모든 유저에게 정지 사실을 메일로 발송함.
        
        int[] answer = new int[id_list.length];
        
        Map<String, Integer> idIndex = new HashMap<>();
        for (int i = 0; i < id_list.length; i++) {
            idIndex.put(id_list[i], i);
        }
        
        // 중복 신고를 1회로 처리함
        Set<String> reportSet = new HashSet<>();
        for (String s : report) {
            reportSet.add(s);
        }
        
        // 누가 누구를 신고 했는가?
        Map<String, Set<String>> reportMap = new HashMap<>();
        for (String s : reportSet) {
            String[] parts = s.split(" ");
            String from = parts[0];     // 신고한 사람
            String to = parts[1];       // 신고당한 사람
            
            if (!reportMap.containsKey(from)) {
                reportMap.put(from, new HashSet<>());
            }
            reportMap.get(from).add(to);
        }
        
        // 신고 당한 사람이 몇 번 신고 당했는지
        Map<String, Integer> reportCountMap = new HashMap<>();
        for (String s : reportSet) {
            String[] parts = s.split(" ");
            reportCountMap.put(parts[1], reportCountMap.getOrDefault(parts[1], 0) + 1);
        }
        
        // 정지된 사람 기준으로 메일의 수를 계산
        for (String target : id_list) {
            int reportCount = reportCountMap.getOrDefault(target, 0);
            if (reportCount < k) continue; // k번 이상 아니면 정지가 아님
            
            // target을 신고한 사람 찾기
            for (Map.Entry<String, Set<String>> entry : reportMap.entrySet()) {
                String from = entry.getKey();
                Set<String> tos = entry.getValue();
                if (tos.contains(target)) {
                    answer[idIndex.get(from)]++;
                }
            }
        }
        return answer;
    }
}