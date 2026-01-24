import java.util.*;

class Solution {
    public int[] solution(String[] genres, int[] plays) {
        // 장르 별로 가장 많이 재생된 노래 2개식 모아 베스트 앨범 출시
        // 노래가 많이 재생된 장르를 먼저 수록함.
        // 장르 내에서 많이 재생된 노래 수록함.
        // 장르 내에서 재생된 횟수가 동일할 시 고유번호가 낮은 노래를 먼저 수록함.
        
        // 각 장르별 재생 횟수 계산
        Map<String, Integer> map = new HashMap<>();
        
        for (int i = 0; i < plays.length; i ++) {
            //System.out.println("genre: " + genres[i] + ", plays: " + plays[i]);
            
            map.put(genres[i], map.getOrDefault(genres[i], 0) + plays[i]);
        }
        
        // 장르를 총 재생 수 기준 내림차순으로 정렬함.
        List<String> sortedGenres = new ArrayList<>(map.keySet());
        sortedGenres.sort((g1, g2) -> map.get(g2) - map.get(g1));
        
        // 장르별 곡 목록(고유번호, 재생 수) 모으기
        Map<String, List<int[]>> songsByGenre = new HashMap<>();
        
        for (int i = 0; i < genres.length; i++) {
            String genre = genres[i];
            int play = plays[i];
            
            // 해당 장르가 아직 없으면 리스트 생성
            if (!songsByGenre.containsKey(genre)) {
                songsByGenre.put(genre, new ArrayList<>());
            }
            
            // 곡 정보 추가
            songsByGenre.get(genre).add(new int[]{i, play});
        }
        
        // 결과 반환
        List<Integer> result = new ArrayList<>();
        for (String genre : sortedGenres) {
            List<int[]> list = songsByGenre.get(genre);
            
            list.sort((a, b) -> {
                if (a[1] != b[1]) return b[1] - a[1];  // play의 인덱스 비교
                return a[0] - b[0];                     // 인덱스 반환
            });
            
            // 상위 최대 2개 고유번호 찾기
            int limit = Math.min(2, list.size());
            
            for (int i = 0; i < limit; i++) {
                result.add(list.get(i)[0]);
            }
        }
        
        int[] answer = result.stream()
            .mapToInt(Integer::intValue)
            .toArray();
        return answer;
    }
}